package api.controllers;

import pojo.Student;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Path("/testhello")
@WebServlet("/testhello")
public class CdiFirst extends HttpServlet {
    @Inject
    Student student;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("125564546");
        System.out.println(student.getName());
    }

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        System.out.println(student.getName());
        return "CDI hello";
    }*/
}


