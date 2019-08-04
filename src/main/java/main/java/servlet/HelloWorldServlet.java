package main.java.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private String name;
    private String password;
    private String mesaj;


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = new PrintWriter(response.getWriter());
        out.println("<html>\n" +
                "  <head>\n" +
                "    <title>HelloWorld title</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "  Hello World at " + new Date() +
                "  </body>\n" +
                "</html>");
        out.close();
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        this.name = name;
        this.password = password;

        request.setAttribute("name", name);

        if ("abc123".equals(password)) {
            mesaj = "M-am logat cu succes!";
        } else {
            mesaj = "Sorry, username or password error!";
        }
        request.setAttribute("mesaj", mesaj);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


