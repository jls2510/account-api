import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        NoClassTest.class,
        MyClassTest.class,
        WeekdayUtilitiesTest.class,
        ParameterizedTest.class,
        ParameterizedConstructorTest.class
})

public class TestSuite {
}
