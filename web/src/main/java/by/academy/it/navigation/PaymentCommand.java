package by.academy.it.navigation;

import by.academy.it.constants.Constants;
import by.academy.it.entity.Order;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PaymentCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderService orderService = new OrderService();
        String carID = request.getParameter("idCar");
        String userID = request.getParameter("userID");
        String ordedDate = "XXXX-XX-XX";
        Integer price = Integer.valueOf(request.getParameter("priceCar"));
        String orderStatus = "WAITING";
        Order order = new Order(carID, userID, ordedDate, price, orderStatus);
        orderService.addOrder(order);
        return Constants.PAGE_AUTO_SWITCH;
    }
}
