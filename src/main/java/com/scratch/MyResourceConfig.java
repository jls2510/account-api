package com.scratch;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;


@ApplicationPath("")
public class MyResourceConfig extends ResourceConfig {
    public static String env;
    private static final String configFile = "config.properties";

    public MyResourceConfig() {
        register(new AbstractBinder() {
            @Override
            protected void configure() {
            }
        });
        packages("com.scratch.api");
    }

    /*Add environment to variable*/
    private static String getEnv(String variable) {
        return env + "." + variable;
    }

    /*return the environment variable*/
    public static String config(String variable) throws IOException {
        //return context.getInitParameter(getEnv(variable));
        Properties config = new Properties();
        config.load(Thread
                .currentThread()
                .getContextClassLoader()
                .getResourceAsStream(configFile));


        return config.getProperty(MyResourceConfig.env(variable));
    }

    private static String env(String variable) {
        String hostname;
        String environment;

        environment = System.getenv("environment");

        if (environment == null) {
            try {
                hostname = InetAddress
                        .getLocalHost().getHostName();
                switch (hostname) {

                    case "t1ps-winjit01": {
                        environment = "staging";
                        break;
                    }
                    case "t1prd-jbit-tomcat01.odysseylogistics.com": {
                        environment = "production";
                        break;
                    }
                    default: {
                        environment = "local";
                    }
                }

                // test for localhost deployment
                // KOLAP18 is Carrier Stevenson's machine
                String isGrizzly = System.getProperty("isGrizzly");
                if ((isGrizzly != null && isGrizzly.equals("true")) || hostname.equals("KOLAP18")) {
                    environment = "local";
                }
                //println("App: hostname = " + hostname)
                //println("App: environment = " + environment)

            } catch (UnknownHostException e) {
                environment = "local";
            }
        }

        return environment + "." + variable;
    }

}
