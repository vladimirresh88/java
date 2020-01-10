package api.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class TestController {
    @GET
    @Produces("application/json; charset=UTF-8")
    public String getMessage() {
        return "Куку, ёпта!";
    }
}
