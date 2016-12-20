import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by siddhartha.dhanetwal on 12/20/2016.
 */
@Path("/helloworld")
public class HelloWorld {
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    @GET
    @Path("/another-resource/{name}")
    @Produces("text/plain")
    public String showName(@PathParam("name") String Name) {
        // Return some cliched textual content
        return Name+" this is another resource";
    }
}
