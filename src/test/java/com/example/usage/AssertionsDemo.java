package com.example.usage;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsDemo {

    @Test
    void basicAssertions() {
        assertEquals(2, 1 + 1);
        assertEquals(2, 1 + 1, "1 + 1 = 2");
        assertNull(null);
        assertNotNull(this);
        assertSame("foo", "foo");
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test
    void hamcrestAssertions() {
        assertThat("some text", allOf(notNullValue(), containsString("x")));
    }

    @Test
    void multipleFailures() {
        assertAll(
                () -> assertThat("foo", is(nullValue())),
                () -> assertThat("foo", is(sameInstance("bar")))
        );
    }

}
