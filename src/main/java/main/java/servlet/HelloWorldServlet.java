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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        this.name = name;
        request.setAttribute("name", name);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
