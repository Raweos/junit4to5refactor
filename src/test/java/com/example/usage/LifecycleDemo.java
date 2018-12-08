package com.example.usage;

import org.junit.*;
import org.junit.rules.TestName;

import static junit.framework.TestCase.assertEquals;

public class LifecycleDemo {

    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @Before
    public void beforeEach() {
        System.out.println("beforeEach: " + testName.getMethodName() + " in " + this);
    }

    @Test
    public void onePlusOneIsTwo() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void zeroPlusTwoIsTwo() {
        assertEquals(2, 0 + 2);
    }

    @After
    public void afterEach() {
        System.out.println("afterEach: " + testName.getMethodName() + " in " + this);
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
