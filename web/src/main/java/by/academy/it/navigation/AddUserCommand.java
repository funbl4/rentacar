package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.academy.it.constants.Constants.PAGE_ADD_USER;

public class AddUserCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return PAGE_ADD_USER;
    }
}
