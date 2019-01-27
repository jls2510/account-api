package com.scratch;

import com.scratch.MyResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

import java.io.IOException;
import java.net.URI;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


/**
 * Main class.
 */
class Main {
    // Base URI the Grizzly HTTP server will listen on
    private static String BASE_URI = "http://localhost:8080/";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     *
     * @return Grizzly HTTP server.
     */
    private static HttpServer startServer() {
        // createNewOpportunity a resource config that scans for JAX-RS resources and providers
        // in com.win package

        // set a flag so we know that we are running under grizzly
        System.setProperty("isGrizzly", "true");

        ResourceConfig rc = new MyResourceConfig();

        // createNewOpportunity and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        HttpServer httpServer = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);

        return httpServer;
    }

    /**
     * Main method.
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        HttpServer server = startServer();
        System.out.println(String.format("Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read();
        server.shutdown();
    }
}

