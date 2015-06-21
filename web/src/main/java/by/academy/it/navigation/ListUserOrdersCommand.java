package by.academy.it.navigation;

import by.academy.it.pojo.Order;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.academy.it.constants.Constants.*;

public class ListUserOrdersCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderService orderService = new OrderService();
        List<Order> ordersUserList = orderService.getOrdersByUser(Integer.valueOf(request.getParameter(PARAM_USER_ID)));
        request.setAttribute("ordersUserList", ordersUserList);
        return PAGE_USER_ORDERS;
    }
}
