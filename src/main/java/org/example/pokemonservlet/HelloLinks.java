package org.example.pokemonservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloGrit", value = "/hellolinks")
public class HelloLinks extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello students at grit!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>");
        out.println("<li><a href=\"/hellolinks\">Hello Links</a></li>");
        out.println("<li><a href=https://github.com/>Github</a></li>");
        out.println("</ul>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}