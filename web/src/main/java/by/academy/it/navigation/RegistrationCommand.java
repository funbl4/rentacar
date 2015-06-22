/*
package by.academy.it.navigation;

import by.academy.it.pojo.User;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.academy.it.constants.Constants.PAGE_AUTO_SWITCH;

public class RegistrationCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String passport = request.getParameter("passport");
        String phoneNumber = request.getParameter("phone_number");
        UserService userService = new UserService();
        User user = new User(email, password, "USER", firstName, lastName, passport, phoneNumber);
        userService.addUser(user);
        return PAGE_AUTO_SWITCH;
    }
}
*/
