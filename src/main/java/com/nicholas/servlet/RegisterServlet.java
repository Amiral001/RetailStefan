package com.nicholas.servlet;

import com.nicholas.entity.Users;
import com.nicholas.util.ValidareLogin;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

@WebServlet(name = "Register", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    private String name;
    private String password;
    Users users;
    String message;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("newName");
        String password = request.getParameter("newPassword");
        this.name = name;
        this.password = password;
        users = new Users();
        users.setUserName(name);
        users.setUserPass(password);
        ValidareLogin instance = new ValidareLogin();
        instance.insertUser(users);
        message = "Successfully registered";
        request.setAttribute("message", message);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
