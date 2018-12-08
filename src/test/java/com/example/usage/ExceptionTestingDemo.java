package com.example.usage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionTestingDemo {
    private String intString = "xD";
    private String expectedMessage = "For input string: \"" + intString + "\"";

    @Test
    void newApproach() {
        NumberFormatException expectedEx = assertThrows(
                NumberFormatException.class, () -> Integer.parseInt(intString));
        assertEquals(expectedMessage, expectedEx.getMessage());
    }
}
