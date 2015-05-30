package by.academy.it.service;


import by.academy.it.dao.OrderDAO;
import by.academy.it.dao.impl.OrdersDAOImpl;
import by.academy.it.entity.Order;

import java.util.List;

public class OrderService {

    private OrderDAO orderDAO;

    public OrderService() {
        orderDAO = new OrdersDAOImpl();
    }

    public void addOrder(Order order) {
        orderDAO.addOrder(order);
    }

    public List<Order> getOrders() {
        return orderDAO.getOrders();
    }

    public List<Order> getOrdersByUser(Integer idUser) {
        return orderDAO.getOrdersByUser(idUser);
    }
}
