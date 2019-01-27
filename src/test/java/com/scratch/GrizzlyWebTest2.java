package com.scratch;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.WebTarget;

public class GrizzlyWebTest2 extends JerseyTest {

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new GrizzlyWebTestContainerFactory();
    }

    @Override
    protected DeploymentContext configureDeployment() {
        return ServletDeploymentContext.forServlet(new ServletContainer(new ResourceConfig(HelloResource.class))).build();
    }

    @Test
    public void testGet() {
        WebTarget target = target("root");

        String s = target.request().get(String.class);
        Assert.assertEquals("GET", s);
    }

    @Test
    public void testGetSub() {
        WebTarget target = target("root/sub");

        String s = target.request().get(String.class);
        Assert.assertEquals("sub", s);
    }

    @Test
    public void testSingleNode() throws Exception {
        final String hello = target("root/hello").request().get(String.class);
        Assert.assertEquals("Hello World!", hello);

    }

    @Path("root")
    public static class HelloResource {
        @GET
        public String get() {
            return "GET";
        }

        @Path("hello")
        @GET
        public String getHello() {
            return "Hello World!";
        }

        @Path("sub")
        @GET
        public String getSub() {
            return "sub";
        }
    }

}
