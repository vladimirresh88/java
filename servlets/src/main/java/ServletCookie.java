import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletcookie")
public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " = " + cookie.getValue());
            response.getWriter().write(cookie.getName() + " = " + cookie.getValue());
        }
        Cookie cookie = new Cookie("testcookie" , "NEW_cookie");
        cookie.setMaxAge(5); // время жизни куки
        cookie.setPath("/servlets/servletcookie"); //куки доступен только для пути
        //cookie.setComment("Тестовый куки");
        response.addCookie(cookie);

    }
}
