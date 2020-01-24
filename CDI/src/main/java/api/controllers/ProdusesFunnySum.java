package api.controllers;

import anotation.Anatations;
import pojo.Name;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Providers;
import java.net.http.HttpHeaders;

@Path("/funnysum")
public class ProdusesFunnySum {
    @Inject
    String s1;
    @Inject
    @Anatations.SecondStringAnotation
    String s2;
    @Inject
    int i1;
    @Inject
    double d;
    @Inject
    Name name;

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Consumes("text/html; charset=UTF-8")
    public String getMessage(@Context HttpHeaders httpHeaders, @Context Request request, @Context SecurityContext securityContext, @Context Providers providers) {
        return "Hello cdi Produses: " + s1 + " " + s2 + " " + i1 + " " + d + " " + name.name;
    }
}
