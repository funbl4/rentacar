/*
package by.academy.it.navigation;

import by.academy.it.constants.Constants;
import by.academy.it.navigation.commands.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("userID") != null) {
            request.getSession().removeAttribute("userID");
            request.getSession().removeAttribute("userLastName");
            request.getSession().removeAttribute("userFirstName");
            request.getSession().removeAttribute("userRole");
        }
        return Constants.PAGE_INDEX;
    }
}
*/
