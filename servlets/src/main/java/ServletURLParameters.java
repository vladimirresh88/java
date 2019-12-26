import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servleturlparmeters")
public class ServletURLParameters extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Hello Servlet!");
        // Работа с параметрами
        //
        System.out.println(request.getParameter("one"));
        Enumeration<String> parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String elementName = parameters.nextElement();
            System.out.println(elementName + " = " + request.getParameter(elementName));
        }

    }
}
