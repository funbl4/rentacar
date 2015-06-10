package by.academy.it.navigation;

import by.academy.it.constants.Constants;
import by.academy.it.pojo.User;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveUserCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter(Constants.PARAM_EMAIL);
        String password = request.getParameter(Constants.PARAM_PASSWORD);
        String role = request.getParameter(Constants.PARAM_ROLE);
        String firstName = request.getParameter(Constants.PARAM_FIRST_NAME);
        String lastName = request.getParameter(Constants.PARAM_LAST_NAME);
        String passport = request.getParameter(Constants.PARAM_PASSPORT);
        String phoneNumber = request.getParameter(Constants.PARAM_PHONE_NUMBER);
        User user = new User(email, password, role, firstName, lastName, passport, phoneNumber);
        UserService userService = new UserService();
        userService.addUser(user);
        return Constants.PAGE_INDEX;
    }
}
