package by.academy.it.dao;

import by.academy.it.pojo.Order;

import java.util.List;

public interface IOrderDAO {
    void addOrder(Order order);

    List<Order> getOrders();

    List<Order> getOrdersByUser(Integer idUser);
}
