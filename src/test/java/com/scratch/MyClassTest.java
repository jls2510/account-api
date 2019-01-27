package com.scratch;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyClassTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void A_testDoubleMe() {
        MyClass classUnderTest = new MyClass();
        int single = 6;
        int expectedDoubledValue = 12;
        int actualDoubledValue = classUnderTest.doubleMe(single);

        assertEquals("Wrong-O Mary Lou!", expectedDoubledValue, actualDoubledValue);

    }

    @Test
    /**
     * Given two int values where one is zero, when multiplied by the "multiply" method then the result should be zero
     */
    public void B_multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass classUnderTest = new MyClass();

        assertEquals(0, classUnderTest.multiply(10,0));
        assertEquals(0, classUnderTest.multiply(0,10));
        assertEquals(0, classUnderTest.multiply(0,0));
    }
}
