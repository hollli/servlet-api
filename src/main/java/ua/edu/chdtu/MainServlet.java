package ua.edu.chdtu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher view = req.getRequestDispatcher("static/index.html");
        view.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp) throws ServletException, IOException {
        String main = req.getParameter("qq");
        int mm = main.length() / 2;
        String[] userinput = {main.substring(0, mm), main.substring(mm)};
        String first = userinput[0];
        String qq = first +"***********" +userinput[1];
        PrintWriter writer = resp.getWriter();
        resp.getWriter().write("" + convertDataToJSON(qq)+"");
    }


    private String convertDataToJSON(String qq) {

        String jsonData = qq;
        return jsonData;
    }

}
