package com.example.usage;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertSame;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class AssertionsDemo {

    @Test
    public void basicAssertions() {
        assertEquals(2, 1 + 1);
        assertEquals("1 + 1 = 2", 2, 1 + 1);
        assertNull(null);
        assertNotNull(this);
        assertSame("foo", "foo");
        assertArrayEquals(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
    }

    @Test
    public void hamcrestAssertions() {
        assertThat("some text", allOf(notNullValue(), containsString("x")));
    }

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void multipleFailures() {
       errorCollector.checkThat("foo", is(nullValue()));
       errorCollector.checkThat("foo", is(sameInstance("bar")));
    }

}
