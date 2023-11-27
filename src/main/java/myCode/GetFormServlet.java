package myCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "GetFromServlet", value= "/GetFromServlet")
public class GetFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        //GET parameters from get request
        String bookName = request.getParameter("name");
        String bookPrice = request.getParameter("price");
        String bookAuthor = request.getParameter("author");

        PrintWriter out = response.getWriter();
        out.println("<h3> Name: " +bookName + " </h3>");
        out.println("<h3> Price: " +bookPrice + " </h3>");
        out.println("<h3> Author: " +bookAuthor + " </h3>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
