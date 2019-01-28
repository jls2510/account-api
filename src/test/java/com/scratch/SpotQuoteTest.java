package com.scratch;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.mock.web.MockServletContext;

import javax.servlet.ServletContext;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class SpotQuoteTest extends JerseyTest {

    private static final String ENV = "demo";
    private static final String DB_URL =
            "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST = (ADDRESS = (PROTOCOL = TCP)" +
                    "(HOST = t1ps-db06)(PORT = 1521))) (CONNECT_DATA = (SERVER = DEDICATED) (SID = PS03)))";

    private static final String DB_USER = "win";
    private static final String DB_SCHEMA = "WIN";
    private static final String DB_PASSWORD = "gj438sn2f";
    private static final String EXPIRE_TIME_BUFFER = "3";
    private static final String EXPIRE_TIME_BUFFER_UOM = "hours";
    static final HttpAuthenticationFeature BASIC_WIN_AUTHENTICATION =
            HttpAuthenticationFeature.basic("ows@winteam.com", "Odyssey100");

    static final HttpAuthenticationFeature BASIC_ACME_AUTHENTICATION =
            HttpAuthenticationFeature.basic("ows@acme.com", "Odyssey100");

    static final Integer OK = Response.Status.OK.getStatusCode();
    static final Integer BAD_REQUEST = Response.Status.BAD_REQUEST.getStatusCode();
    static final Integer UNAUTHORIZED = Response.Status.UNAUTHORIZED.getStatusCode();
    static final Integer NOT_FOUND = Response.Status.NOT_FOUND.getStatusCode();
    static final Integer METHOD_NOT_ALLOWED = Response.Status.METHOD_NOT_ALLOWED.getStatusCode();
    static final String SHIPMENT_ID = "S-18-0056669";
    static final String UNKNOWN_SHIPMENT_ID = "S-18-unknown";
    static final String CANCELLED_SHIPMENT_ID = "S-18-0057403";
    static final String CLOSED_SPOT_QUOTE_SHIPMENT_ID = "S-18-0057256";
    static final String SENDER_EMAIL = "ows@winteam.com";
    static final String RECEIVER_EMAIL = "anthony.garcia@kogentservices.com";

    // fields used together with @Parameter must be public
    private Integer expectedStatus = 500;
    private Integer responseStatus = 500;


    ServletContext initializeServletContext() {
        ServletContext context = new MockServletContext();

        context.setInitParameter("env", ENV);
        context.setInitParameter("demo.win_url", DB_URL);
        context.setInitParameter("demo.win_user", DB_USER);
        context.setInitParameter("demo.win_schema", DB_SCHEMA);
        context.setInitParameter("demo.win_password", DB_PASSWORD);
        context.setInitParameter("demo.expire_time_buffer", EXPIRE_TIME_BUFFER);
        context.setInitParameter("demo.expire_time_buffer_uom", EXPIRE_TIME_BUFFER_UOM);

        return context;
    }

    @Override
    protected DeploymentContext configureDeployment() {
        ServletContext servletContext = initializeServletContext();
        MyResourceConfig myResourceConfig =
                new MyResourceConfig();

        return ServletDeploymentContext
                .forServlet(new ServletContainer(myResourceConfig))
                .build();
    }

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new GrizzlyWebTestContainerFactory();
    }

    @Test
    //@Ignore
    public void get() {
        System.out.println("UrlResponseTest.get()");
        WebTarget webTarget
                = target("echo/Hello");

        Response response =
                webTarget.request(MediaType.TEXT_PLAIN)
                        .accept(MediaType.APPLICATION_JSON)
                        .get();

        Assert.assertEquals("Http Response should be 200: ", Response.Status.OK.getStatusCode(), response.getStatus());
        Assert.assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    /**
     * @param expectedStatus expected response status
     * @param responseStatus the http response status that was received
     */
    void checkResponseStatus(Integer expectedStatus, Integer responseStatus) {
        String assertStatusErrorMessage = String.format("Http Response should be %d, received %d", expectedStatus, responseStatus);

        Assert.assertEquals(assertStatusErrorMessage, expectedStatus, responseStatus);
    }

    /**
     * @param responseType content type that was received from the http call
     */
    void checkContentType(String responseType) {
        String assertContentTypeErrorMessage =
                String.format("Http Content-Type should be %s, received %s", MediaType.APPLICATION_JSON, responseType);

        Assert.assertEquals(assertContentTypeErrorMessage, MediaType.APPLICATION_JSON, responseType);
    }
}
