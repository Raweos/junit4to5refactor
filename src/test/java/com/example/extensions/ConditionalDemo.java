package com.example.extensions;


import org.junit.Test;

import static junit.framework.TestCase.fail;

public class ConditionalDemo {

    @Test
    @DisabledOnMonday
    public void conditionalTest() {
        fail("monday again :(");
    }
}
