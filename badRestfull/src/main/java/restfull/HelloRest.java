package restfull;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class HelloRest {
    @GET
    @Produces("text/html; charset=UTF-8")
    public String getMessage() {
        return "Hello bad rest";
    }
}
