package by.academy.it.dao.impl;

import by.academy.it.dao.IOrderDAO;
import by.academy.it.pojo.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAOImplI implements IOrderDAO {

    private static final String SQL_QUERY_ADD_ORDER = "INSERT INTO orders (car, customer, date_order, price, order_status) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_QUERY_GET_ALL_ORDERS = "SELECT * FROM orders";
    private static final String SQL_QUERY_GET_ORDERS_BY_USER = "SELECT id_order, brand, customer, date_order, order_status, orders.price FROM orders, cars WHERE orders.car = cars.id_car AND customer = ?";

   /* private SimpleBasicDataSource dataSource;

    public OrdersDAOImplI() {
        dataSource = SimpleBasicDataSource.getInstance();
    }

    public List<Order> getOrdersByUser(Integer idUser) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Order> orderListByID = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ORDERS_BY_USER);
            preparedStatement.setInt(1, idUser);
            resultSet = preparedStatement.executeQuery();
            orderListByID = initOrders(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return orderListByID;
    }

    public List<Order> getOrders() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Order> orderList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_ORDERS);
            resultSet = preparedStatement.executeQuery();
            orderList = initOrders(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return orderList;
    }

    public void addOrder(Order order) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            try {
                connection = dataSource.getConnection();
                preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_ORDER);
                preparedStatement.setString(1, order.getCar());
                preparedStatement.setString(2, order.getCustomer());
                preparedStatement.setString(3, order.getDate());
                preparedStatement.setInt(4, order.getPrice());
                preparedStatement.setString(5, order.getOrderStatus());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                UtilsDB.closeDBConnection(connection, preparedStatement);
            }
    }*/

    private List<Order> initOrders(ResultSet resultSet) throws SQLException {
        List<Order> orderList = new ArrayList<Order>();
        while (resultSet.next()) {
            Order order = new Order();
            order.setIdOrder(resultSet.getInt(1));
            order.setCar(resultSet.getString(2));
            order.setCustomer(resultSet.getString(3));
            order.setDate(resultSet.getString(4));
            order.setOrderStatus(resultSet.getString(5));
            order.setPrice(resultSet.getInt(6));
            orderList.add(order);
        }
        return orderList;
    }

    public void addOrder(Order order) {

    }

    public List<Order> getOrders() {
        return null;
    }

    public List<Order> getOrdersByUser(Integer idUser) {
        return null;
    }
}
