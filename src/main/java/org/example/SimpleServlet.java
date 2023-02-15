package org.example;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {

    static final String TEMPLATE = "<html>" +
            "<head><title>Prog.kiev.ua/title></head>" +
            "<body><h1>Hello, %s</h1></body></html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println(String.format("<body><h1>Hello, %s</h1></body></html>", name));

    }


}