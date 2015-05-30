package by.academy.it.dao;

import by.academy.it.entity.Order;

import java.util.List;

public interface OrderDAO {
    void addOrder(Order order);

    List<Order> getOrders();

    List<Order> getOrdersByUser(Integer idUser);
}
