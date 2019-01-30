package com.scratch.junk;

import org.junit.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UrlResponseTest {

    private static final String CONTENT_TYPE_GOOGLE = "text/html; charset=ISO-8859-1";

    @Test
    public void get() {
        System.out.println("UrlResponseTest.get()");
        Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://www.google.com");

        Response response = webTarget.request(MediaType.TEXT_PLAIN).get();


        Assert.assertEquals("Http Response should be 200: ", Response.Status.OK.getStatusCode(), response.getStatus());
        //Assert.assertEquals("Http Content-Type should be: ", MediaType.TEXT_HTML, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
        Assert.assertEquals("Http Content-Type should be: ", CONTENT_TYPE_GOOGLE, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

}
