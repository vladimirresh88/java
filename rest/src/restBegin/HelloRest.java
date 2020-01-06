package restBegin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/restHello")
public class HelloRest {
    @GET public String sayHelloRest(){
        return "Hello REST!!!";
    }
}

