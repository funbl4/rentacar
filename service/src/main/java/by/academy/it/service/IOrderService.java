package by.academy.it.service;

import by.academy.it.pojo.Order;
import by.academy.it.pojo.User;

import java.io.Serializable;
import java.util.List;

public interface IOrderService {

    void addOrder(Order order);

    void removeOrder (Order order);

    Order getOrderById(Serializable id);

    List<Order> getOrders();

}
