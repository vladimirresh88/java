import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletpost")
    public class ServletTest extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Работа с POST
            String one = request.getParameter("one");
            String two = request.getParameter("two");
            response.getWriter().write("<html>" +
                    "<head></head>" +
                    "<body>" +
                    "one = " + one +
                    "two = " + two +
                    "<form action='servlethello' method='post'>" + // можно установить method='get'
                    "<input type='text' name='one'/>" +
                    "<input type='text' name='two'/>" +
                    "<input type='submit' name='submit'/>" +
                    "</form>" +
                    "</body>" +
                    "</html>");
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }
}

