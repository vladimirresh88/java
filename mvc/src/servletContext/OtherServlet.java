package servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/showServletContext")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(req.getServletContext().getAttribute("one").toString());
        ServletContext servletContext = getServletContext();
        Enumeration<String> atributeNames = servletContext.getAttributeNames();
        while (atributeNames.hasMoreElements()) {
            String s = atributeNames.nextElement();
            System.out.println(s + servletContext.getAttribute(s));
        }
    }
}
