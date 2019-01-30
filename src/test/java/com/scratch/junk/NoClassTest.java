package com.scratch.junk;

import java.util.logging.Logger;
import org.junit.*;

public class NoClassTest {

    @Rule
    public TestLogger testLogger = new TestLogger();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSameness() {
        // inner class com.scratch.junk.TestObject
        TestObject x = new TestObject();
        TestObject y = new TestObject();
        TestObject z = x;

        //Assert.assertSame("Different object 1", x, y);
        Assert.assertSame("Different object 2", x, z);
    }

    @Test
    public void toleranceTest() {
        double x = 10.10000000000000;
        double y = 10.20000000000000;
        double z = 10.30000000000000;

        double tolerance = 0.1000;
        tolerance = 0.20000000000001; // limit of precision

        Assert.assertEquals("Out of Tolerance 1", x, y, tolerance);
        Assert.assertEquals("Out of Tolerance 2", x, z, tolerance);
    }

    @Test(expected = NullPointerException.class)
    public void testNPE() {
        String x = null;

        final Logger log = testLogger.getLogger();
        log.info("Log Test");

        x.length();

    }

    @Test
    @Ignore
    public void testNullAssertions() {
        String x = null;
        x = "Do I look NULL to you?";

        Assert.assertNotNull("It IS null!", x);

        // this will fail, barring the assumption
        Assume.assumeFalse(System.getProperty("os.name").contains("Linux"));
        Assert.assertNull("It's NOT null!", x);

    }

    @Test
    public void testOne() {

        String condition = "Grape";
        //condition = "Raisin";
        Assert.assertEquals("Failure! They aren't equal, are they?", condition, "Grape");
    }

    @Test
    public void testTwo() {

        Assert.assertTrue("Failure! It's not true, is it?", true);
        //Assert.fail("Failed on purpose, duh!");
    }

}

/**
 * inner test object class
 */
class TestObject {
}