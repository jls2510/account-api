import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        //Result result = JUnitCore.runClasses(com.scratch.MyClassTest.class);
        Result result = JUnitCore.runClasses(TestSuite.class);

        System.out.println("");
        System.out.println("Number of Tests Run: " + result.getRunCount());
        System.out.println("Number of Tests Failed: " + result.getFailureCount());

        if (result.getFailureCount() > 0) {
            System.out.println("");
            System.out.println("Failure Report: ");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println("");
        }
    }
}
