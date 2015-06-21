package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetUserCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
 /*       UserService userService = new UserService();
        User user = userService.getUserByID()
        List<User> userList = userService.getUsers();
        request.setAttribute(PARAM_USERS, userList);
        return PAGE_LIST_USERS;*/
        return null;
    }
}
