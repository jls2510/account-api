package com.scratch;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.core.*;

public class CarrierTest extends SpotQuoteTest {

    @Test
    @Ignore
    public void get() {
        Response response =
                target("")
                        .request(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .get();

        Assert.assertEquals("Http Response should be 200: ", Response.Status.OK.getStatusCode(), response.getStatus());
        Assert.assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));

    }

    @Test
    @Ignore
    public void noAuthGet() {
        Response response =
                target("")
                        .request(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .get();

        Assert.assertEquals("Http Response should be 401: ", Response.Status.UNAUTHORIZED.getStatusCode(), response.getStatus());
        Assert.assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

    @Test
    @Ignore
    public void wrongShipmentGet() {
        Response response =
                target("")
                        .request(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .get();

        Assert.assertEquals("Http Response should be 404: ", Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
        Assert.assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }
}
