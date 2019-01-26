

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestLogger implements TestRule {
    private Statement base;
    private Description description;

    private Logger logger;
    private FileHandler fileHandler = null;

    static {
        new File("logs").mkdirs();
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    //fileHandler = new FileHandler("logs/" + description.getTestClass().getName() + ".log", true);
                    fileHandler = new FileHandler("logs/" + description.getTestClass().getName() + '.' + description.getMethodName() + ".log", true);
                } catch (SecurityException | IOException e) {
                    e.printStackTrace();
                }
                fileHandler.setFormatter(new SimpleFormatter());
                logger = Logger.getLogger(description.getTestClass().getName() + '.' + description.getMethodName());
                logger.addHandler(fileHandler);
                base.evaluate();
            }
        };
    }

}
