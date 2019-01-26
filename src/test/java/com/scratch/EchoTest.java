package com.scratch;

import org.junit.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.net.ProtocolException;

import static org.junit.Assert.*;

public class EchoTest {


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() throws IOException, ProtocolException {
        System.out.println("EchoTest.get()");
        Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://localhost:8080/echo/Hello");


        Response response =
                webTarget.request(MediaType.TEXT_PLAIN)
                        .accept(MediaType.APPLICATION_JSON)
                        .get();

        Assert.assertEquals("Http Response should be 200: ", Response.Status.OK.getStatusCode(), response.getStatus());
        Assert.assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));

    }

    @Test
    public void dummyTest() {
        assertTrue(true);
    }

}
