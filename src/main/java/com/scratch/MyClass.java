package com.scratch;

/**
 *
 */
public class MyClass {

    public int noNegativeNancies(int arg) throws IllegalArgumentException {
        if (arg < 0) {
            throw new IllegalArgumentException("Negative value not allowed");
        }
        return arg;
    }


    public int doubleMe(int single) {

        return single * 2;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
