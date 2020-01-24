package api;

import api.controllers.CdiFirst;
import api.controllers.ProdusesFunnySum;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class WebModule extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(ProdusesFunnySum.class);
        return h;
    }
}