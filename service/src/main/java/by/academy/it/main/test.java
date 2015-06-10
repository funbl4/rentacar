package by.academy.it.main;

import by.academy.it.pojo.Order;
import by.academy.it.service.OrderService;

public class test {
    public static void main(String[] args) {
        Order order = new Order("2", "1", "2015-09-18", 7500, "CONFIRMED");
        OrderService orderService = new OrderService();
        //orderService.addOrder(order);

    }
}
