package by.academy.it.navigation;

import by.academy.it.pojo.User;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static by.academy.it.constants.Constants.*;

public class ListUsersCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        UserService userService = new UserService();
        List<User> userList = userService.getUsers();
        request.setAttribute(PARAM_USERS, userList);
        return PAGE_LIST_USERS;
    }
}
