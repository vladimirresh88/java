package restfull;

import javax.ws.rs.*;

@Path("/extracting")
@Produces("text/plain; charset=UTF-8")
public class ExtractingRest {

    @GET
    public String returnExtracting() {
        return "I see extracting ";
    }

    @GET
    @Path("/id/{id}")
    public String returnId(@PathParam("id") int id) {
        return "I got parametr id = " + id;
    }

    @GET
    @Path("/name/{name: [a-zA-Z]*}")
    public String returnName(@PathParam("name") String name) {
        return "I got name = " + name;
    }

    // Параметры  http://localhost:8080/badRestfull/extracting/parametrAGE?AGE=123
    @GET
    @Path("/parametrAGE/")
    public String returnId(@QueryParam("AGE") String AGE) {
        return "I got parametr AGE = " + AGE;
    }

    //http://localhost:8080/badRestfull/extracting/matrix/;MatrixParam=ghfgh
    @GET
    @Path("/matrix/")
    public String returnMatrix(@DefaultValue("DefaultV") @MatrixParam("MatrixParam") String p1) {
        return "I got MatrixParam = " + p1;
    }
}
