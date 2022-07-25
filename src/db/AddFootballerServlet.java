package db;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add")
public class AddFootballerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String club = request.getParameter("user_club");
        int salary = Integer.parseInt(request.getParameter("user_salary"));
        int transferPrice = Integer.parseInt(request.getParameter("user_transferPrice"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setClub(club);
        footballer.setSalary(salary);
        footballer.setTransferPrice(transferPrice);

        DBManager.addFootballer(footballer);

        response.sendRedirect("/index");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}
