package com.scratch.api;

import com.scratch.MyResourceConfig;
import com.scratch.database.mysql.jv.tables.pojos.Account;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;
import org.glassfish.jersey.test.spi.TestContainerFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountControllerTest extends JerseyTest {

    private static int accountId = 0; // id known to exist

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
        this.accountId = 19; // known good
        Response response = target("/account/id/" + this.accountId).request().get();
        Assert.assertEquals("Should return status 200", 200, response.getStatus());
        Assert.assertNotNull("Should return user object as json", response.getEntity());
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
    }

    @Test
    @Ignore
    public void testFetchAll() {
        Response response = target("/account").request().get();
        Assert.assertEquals("should return status 200", 200, response.getStatus());
        Assert.assertNotNull("Should return user list", response.getEntity().toString());
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
    }

    @Test
    //@Ignore
    // Note: Create, Update, Delete must occur in order
    public void A_testCreate() {
        Account account = new Account();
        account.setUsername("kogent@ping23.com");
        account.setEmail("kogent@ping23.com");
        account.setFirstName("Jim");
        account.setLastName("KOgent");
        account.setStripeId("cus_DpRjtlFL0608yN");
        account.setIsActive((byte) 1);
        account.setIsVerified((byte) 1);

        Response response = target("/account/create").request().post(Entity.entity(account, MediaType.APPLICATION_JSON));
        System.out.println(response.getStatus());
        Assert.assertEquals("Should return status 201", 201, response.getStatus());

        Account responseAccount = response.readEntity(Account.class);
        System.out.println("responseAccount = " + responseAccount.toString());
        this.accountId = responseAccount.getId().intValue();
    }

    @Test
    //@Ignore
    // Note: Create, Update, Delete must occur in order
    public void B_testUpdate() {
        Account account = new Account();
        account.setUsername("kogent@kogentservices.com");
        account.setEmail("kogent@kogentservices.com");
        account.setFirstName("Jim");
        account.setLastName("KOgent");
        account.setStripeId("cus_DpRjtlFL0608yN");
        account.setIsActive((byte) 1);
        account.setIsVerified((byte) 1);

        Response response = target("/account/update/" + this.accountId).request().put(Entity.entity(account, MediaType.APPLICATION_JSON));

        Assert.assertEquals("Should return status 204", 204, response.getStatus());
        System.out.println(response.getStatus());
    }

    @Test
    //@Ignore
    // Note: Create, Update, Delete must occur in order
    public void C_testDelete() {
        Response response = target("/account/delete/" + this.accountId).request().delete();
        Assert.assertEquals("Should return status 204", 204, response.getStatus());
    }

    @Test
    //@Ignore
    public void D_testGetDeletedAccountById() {
        //this.accountId = 0;
        Response response = target("/account/id/" + this.accountId).request().get();
        Assert.assertEquals("Should return status 304", 304, response.getStatus());

        System.out.println(response.getStatus() + "; " + response.readEntity(String.class));
    }

}
