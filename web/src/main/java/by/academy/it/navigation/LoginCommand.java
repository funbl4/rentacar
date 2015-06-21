package by.academy.it.navigation;

import by.academy.it.pojo.User;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static by.academy.it.constants.Constants.*;
import static by.academy.it.pojo.Role.ADMIN;
import static by.academy.it.pojo.Role.USER;

public class LoginCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session == null || session.getAttribute("userLastName") == null) {
            String uriPath = request.getRequestURI().substring(request.getContextPath().length());

            String login = request.getParameter("login");
            String password = request.getParameter("password");
            UserService userService = new UserService();
            if (userService.loginUser(login, password)) {
                User user = userService.getUserByEmail(login);
                session.setAttribute("userID", String.valueOf(user.getIdUser()));
                session.setAttribute("userLastName", user.getLastName());
                session.setAttribute("userFirstName", user.getFirstName());
                session.setAttribute("userRole", user.getRole());
                if (user.getRole().equals(USER.toString().toUpperCase())) {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_INDEX);
                    requestDispatcher.forward(request, response);
                    return PAGE_INDEX;
                } else if (user.getRole().equals(ADMIN.toString().toUpperCase())) {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_ADMIN_PAGE);
                    requestDispatcher.forward(request, response);
                    return PAGE_ADMIN_PAGE;
                }
            }
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_LOGIN_ERROR);
            requestDispatcher.forward(request, response);
            return PAGE_LOGIN_ERROR;
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_INDEX);
        requestDispatcher.forward(request, response);
        return PAGE_INDEX;
    }
}
