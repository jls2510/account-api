package com.scratch.junk;

import com.scratch.junk.MyClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedConstructorTest {

    private int m1;
    private int m2;
    private int result;

    public ParameterizedConstructorTest(int p1, int p2, int pResult) {
        m1 = p1;
        m2 = p2;
        result = pResult;
    }


    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {1, 2, 2},
                {5, 3, 15},
                {121, 4, 484}
        };
        return Arrays.asList(data);
    }


    @Test
    public void testMultiplyException() {
        MyClass tester = new MyClass();
        assertEquals("Result", result, tester.multiply(m1, m2));
    }


}