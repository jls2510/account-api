package com.scratch;

import com.scratch.database.mysql.jv.tables.pojos.Account;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AccountControllerTest extends JerseyTest {

    private static int accountId = 0;

    @Override
    protected TestContainerFactory getTestContainerFactory() {
        return new GrizzlyWebTestContainerFactory();
    }

    @Override
    protected DeploymentContext configureDeployment() {
        return ServletDeploymentContext.forServlet(new ServletContainer(new MyResourceConfig())).build();
    }

    @Test
    @Ignore
    public void testGetById() {
        Response output = target("/api/account/id/19").request().get();
        Assert.assertEquals("Should return status 200", 200, output.getStatus());
        Assert.assertNotNull("Should return user object as json", output.getEntity());
        System.out.println(output.getStatus());
        System.out.println(output.readEntity(String.class));
    }

    @Test
    @Ignore
    public void tesFetchAll() {
        Response response = target("/api/account").request().get();
        Assert.assertEquals("should return status 200", 200, response.getStatus());
        Assert.assertNotNull("Should return user list", response.getEntity().toString());
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
    }

    @Test
    //@Ignore
    public void testCreate() {
        Account account = new Account();
        account.setUsername("kogent@ping23.com");
        account.setEmail("kogent@ping23.com");
        account.setFirstName("Jim");
        account.setLastName("KOgent");
        account.setStripeId("cus_DpRjtlFL0608yN");
        account.setIsActive((byte)1);
        account.setIsVerified((byte)1);

        Response output = target("/api/account/create").request().post(Entity.entity(account, MediaType.APPLICATION_JSON));
        System.out.println(output.getStatus());
        Assert.assertEquals("Should return status 201", 201, output.getStatus());
    }

    @Test
    //@Ignore
    public void testUpdate() {
        Account account = new Account();
        account.setUsername("kogent@kogentservices.com");
        account.setEmail("kogent@kogentservices.com");
        account.setFirstName("Jim");
        account.setLastName("KOgent");
        account.setStripeId("cus_DpRjtlFL0608yN");
        account.setIsActive((byte)1);
        account.setIsVerified((byte)1);

        Response output = target("/api/account/update/username/kogent@ping23.com").request().put(Entity.entity(account, MediaType.APPLICATION_JSON));

        Assert.assertEquals("Should return status 204", 204, output.getStatus());
        System.out.println(output.getStatus());
    }

    @Test
    //@Ignore
    public void testDelete() {
        Response output = target("/api/account/delete/username/kogent@kogentservices.com").request().delete();
        Assert.assertEquals("Should return status 204", 204, output.getStatus());
    }

    @Test
    @Ignore
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

}
