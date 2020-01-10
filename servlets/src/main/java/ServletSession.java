import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletsession")
public class ServletSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Enumeration<String> atributeNames = session.getAttributeNames();
        while (atributeNames.hasMoreElements()) {
            String atributesName = atributeNames.nextElement();
            System.out.println(atributesName + " = " + session.getAttribute(atributesName));
            response.getWriter().write(atributesName + " = " + session.getAttribute(atributesName));
        }
        // Добавляем атрибуты в сессию
        if(session.isNew()) {
            session.setAttribute("one", "two");
            System.out.println(session.getMaxInactiveInterval());
            response.getWriter().write(session.getMaxInactiveInterval());
        }
    }
}
