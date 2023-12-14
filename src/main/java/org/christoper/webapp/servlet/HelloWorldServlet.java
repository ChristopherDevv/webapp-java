package org.christoper.webapp.servlet;

import jakarta.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet()
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("    <head>");
        out.print("      <meta charset=\"UTF-8\">");
                out.print("      <title>hola-mundo</title>");
        out.print("    </head>");
        out.print("    <body>");
        out.print("    <h1>si si hole</h1>");
        out.print("    </body>");
        out.print("</html>");
        out.close();

    }
}


