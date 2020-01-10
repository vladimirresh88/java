import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletXSS")
public class ServletXSS extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Работа с POST
        String one = request.getParameter("one");

        // XSS
        //защита
        one  = one == null ?  "" : one.replaceAll("<", "&lt").replaceAll(">", "&gt");
        response.getWriter().write("<html>" +
                "<head></head>" +
                "<body>" +
                "one = " + one +
                "<form action='servletXSS' method='post'>" +
                "<textarea type='one' name='one'></textarea>" +
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
