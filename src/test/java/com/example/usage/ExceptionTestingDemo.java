package com.example.usage;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ExceptionTestingDemo {
    private String intString = "xD";
    private String expectedMessage = "For input string: \"" + intString + "\"";

    @Test
    public void oldJUnitApproach() {
        try {
            Integer.parseInt("xD");
            fail("Not a number expected");
        } catch (NumberFormatException expected) {
            assertEquals(expectedMessage, expected.getMessage());
        }
    }

    @Test(expected = NumberFormatException.class)
    public void annotationParameterApproach() {
        Integer.parseInt(intString);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ruleBasedApproach() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage(expectedMessage);
        Integer.parseInt(intString);
    }
}
