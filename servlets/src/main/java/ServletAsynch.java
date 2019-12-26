import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/servletasync", asyncSupported = true)
public class ServletAsynch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AsyncContext asyncContext = request.getAsyncContext();
        asyncContext.start(new Runnable() {
            @Override
            public void run() {
                //System.out.println("Async answer!");
            }
        });
        //response.getWriter().write("Async start complete!");
        asyncContext.complete();
    }
}
