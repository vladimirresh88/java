package api.controllers;

import anotation.Anatations;
import interfaces.iPerson;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/testhello")
public class CdiFirst extends HttpServlet {
    @Inject
    @Anatations.StudentAnotation
    iPerson student;

    @Inject
    @Anatations.CoFoundersAnotation
    iPerson cofounder;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CDI is start");
        System.out.println(student.getName());
        System.out.println(cofounder.getName());
    }
}


