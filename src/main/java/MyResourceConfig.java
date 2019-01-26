import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;


@ApplicationPath("/api")
public class MyResourceConfig extends ResourceConfig {
    public static  String         env;
    private static ServletContext context;

    MyResourceConfig(@Context ServletContext cont) {
        context = cont;
        env = context.getInitParameter("env");

        register(new AbstractBinder() {
            @Override
            protected void configure() {
            }
        });
    }

    /*Add environment to variable*/
    private static String getEnv(String variable) {
        return env + "." + variable;
    }

    /*return the environment variable*/
    public static String config(String variable) {
        return context.getInitParameter(getEnv(variable));
    }
}
