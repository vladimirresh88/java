package restfull;

import resurses.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;
import java.net.http.HttpHeaders;

@Path("/test")
public class HelloRest {
    @Context
    UriInfo uriInfo;

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Consumes("text/html; charset=UTF-8")
    public String getMessage(@Context HttpHeaders httpHeaders, @Context Request request, @Context SecurityContext securityContext, @Context Providers providers) {
        return "Hello bad rest" + uriInfo.getAbsolutePath().toString();
    }

    //http://localhost:8080/badRestfull/rs/test/GET?_wadl&type=xml
    @GET
    @Path("/get")
    @Produces("text/plain; charset=UTF-8")
    @Consumes("text/html; charset=UTF-8")
    public String getPutMessage() {
        return "Hello GET rest";
    }

    @POST
    @Path("/post")
    @Produces("text/plain; charset=UTF-8")
    @Consumes("text/html; charset=UTF-8")
    public String getPostMessage() {
        //throw  new BadRequestException("Bad Request Exception!");
        //throw  new ForbiddenException("Exception!");
        //return "Hello Post rest";
        throw  new RuntimeException("gkskljldfj");
    }

    @GET
    @Path("/getjson")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    //@Consumes("text/plain")
    public Response getJson() {
        //return new Student("Max");
        return Response.ok( new Student("Max", 19), MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/getxml")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes("text/plain")
    public Student getXml() {
        return new Student("Max", 20);
    }
}


@Provider
    class RuntimeExeptionMapper implements ExceptionMapper<RuntimeException>{
    public Response toResponse(RuntimeException e) {
        return Response.status(404).entity(e.getMessage()).type(MediaType.TEXT_PLAIN).build();
    }
}
