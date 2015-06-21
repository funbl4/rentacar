package by.academy.it.service.impl;


import by.academy.it.dao.IOrderDAO;
import by.academy.it.dao.impl.OrdersDAOImpl;
import by.academy.it.pojo.Order;

import java.util.List;

public class OrderService {

    private IOrderDAO IOrderDAO;

    public OrderService() {
        IOrderDAO = new OrdersDAOImpl();
    }

    public void addOrder(Order order) {
        IOrderDAO.addOrder(order);
    }

    public List<Order> getOrders() {
        return IOrderDAO.getOrders();
    }

    public List<Order> getOrdersByUser(Integer idUser) {
        return IOrderDAO.getOrdersByUser(idUser);
    }
}
