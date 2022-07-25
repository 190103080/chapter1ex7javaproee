package servlets;

import db.DBManager;
import db.Footballer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/index")
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        ArrayList<Footballer> footballers = DBManager.getAllFootballers();

        PrintWriter out = response.getWriter();

        for (Footballer footballer : footballers) {
            out.print("<h1 style = 'color: green;'>" + footballer.getName() + " " +  footballer.getSurname() + "</h1>" +
                    "<h3 style = 'color:blue;'> Club: " + footballer.getClub() + "</h3>" +
                    "<h3 style = 'color:red;'> Salary: " + footballer.getSalary() + " EUR </h3>" +
                    "<h3 style = 'color:red;'>   Transfer price: " + footballer.getTransferPrice() + " EUR </h3>");
        }

    }

}
