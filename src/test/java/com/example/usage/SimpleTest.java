package com.example.usage;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    //should be disabled with jUnit5 feature
    public void anotherTest() {
        assertEquals(0, 1 + 1);
    }
}
