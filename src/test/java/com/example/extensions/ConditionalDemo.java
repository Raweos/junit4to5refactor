package com.example.extensions;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ConditionalDemo {

    @Test
    @DisabledOnMonday
    void conditionalTest() {
        fail("monday again :(");
    }
}
