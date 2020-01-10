import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletstatus")
public class ServletStatus  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello Servlet!");
        //response.setStatus(HttpServletResponse.SC_OK);
        //response.sendRedirect("/servlets/servletpost");
        //response.sendError(HttpServletResponse.SC_BAD_REQUEST, "verry serious error!");
        //response.setHeader("Refresh","1");
        response.setHeader("Refresh","5;URL=https://www.google.com");
        System.out.println("refresh");

    }


}
