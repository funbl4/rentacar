package by.academy.it.service.impl;

import by.academy.it.dao.IOrderDAO;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.Order;
import by.academy.it.service.IOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public class OrderService implements IOrderService{

    private static final Logger log = Logger.getLogger(UserService.class);

    @Autowired
    IOrderDAO orderDAO;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addOrder(Order order) {
        try {
            orderDAO.saveOrUpdate(order);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void removeOrder(Order order) {
        try {
            orderDAO.delete(order);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public Order getOrderById(Serializable id) {
        try {
            return orderDAO.get(id);
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<Order> getOrders() {
        try {
            return orderDAO.getAll();
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }
}