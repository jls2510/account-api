import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.test.DeploymentContext;
import org.glassfish.jersey.test.ServletDeploymentContext;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.servlet.ServletContext;
import javax.ws.rs.core.*;

public class CarrierTest extends SpotQuoteTest {

    @Override
    protected DeploymentContext configureDeployment() {
        ServletContext servletContext = initializeServletContext();
        MyResourceConfig myResourceConfig =
                new MyResourceConfig(servletContext) {{

                }};

        return ServletDeploymentContext
                .forServlet(new ServletContainer(myResourceConfig))
                .build();
    }

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
