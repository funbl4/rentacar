package by.academy.it.dao.impl;

import by.academy.it.dao.CarDAO;
import by.academy.it.entity.BodyStyle;
import by.academy.it.entity.Car;
import by.academy.it.pool.SimpleBasicDataSource;
import by.academy.it.utils.UtilsDB;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarsDAOImpl implements CarDAO {

    private static final String SQL_QUERY_ADD_CAR = "INSERT INTO cars (brand, model, body_style, fuel_type, year, price, description, photo, color) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_QUERY_GET_ALL_CARS = "SELECT id_car, brand, model, name_body_style, fuel_type, year, price, description, photo, color FROM cars, body_styles WHERE cars.body_style = body_styles.id_body_style";
    private static final String SQL_QUERY_GET_CAR_BY_ID = "SELECT id_car, brand, model, name_body_style, fuel_type, year, price, description, photo, color FROM cars, body_styles WHERE cars.body_style = body_styles.id_body_style AND id_car = ?";
    private static final String SQL_QUERY_DELETE_CAR_BY_ID = "DELETE FROM cars WHERE id_car = ?";
    private static final String SQL_QUERY_UPDATE_CAR_BY_ID = "UPDATE cars SET brand = ?, model = ?, body_style = ?, fuel_type = ?, year = ?, price = ?, description = ?, photo = ?, color = ? WHERE id_car = ?";
    private static final String SQL_QUERY_GET_ALL_BODY_STYLE = "SELECT * FROM body_styles";

    private SimpleBasicDataSource dataSource;
    private Logger logger = Logger.getLogger(CarsDAOImpl.class);

    public CarsDAOImpl() {
        dataSource = SimpleBasicDataSource.getInstance();
    }

    public List<Car> getCars() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Car> carList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_CARS);
            resultSet = preparedStatement.executeQuery();
            carList = initCars(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return carList;
    }

    public Car getCarByID(Integer idCar) {
        Car car = new Car();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_CAR_BY_ID);
            preparedStatement.setInt(1, idCar);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                car.setIdCar(resultSet.getInt(1));
                car.setBrand(resultSet.getString(2));
                car.setModel(resultSet.getString(3));
                car.setBodyStyle(resultSet.getString(4));
                car.setFuelType(resultSet.getString(5));
                car.setYear(resultSet.getString(6));
                car.setPrice(resultSet.getInt(7));
                car.setDescription(resultSet.getString(8));
                car.setPhoto(resultSet.getString(9));
                car.setColor(resultSet.getString(10));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return car;
    }

    public boolean deleteCar(Integer idCar) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean flag = false;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_DELETE_CAR_BY_ID);
            preparedStatement.setInt(1, idCar);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
        return flag;
    }

    public void updateCar(Car car) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_UPDATE_CAR_BY_ID);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, car.getBodyStyle());
            preparedStatement.setString(4, car.getFuelType());
            preparedStatement.setString(5, car.getYear());
            preparedStatement.setInt(6, car.getPrice());
            preparedStatement.setString(7, car.getDescription());
            preparedStatement.setString(8, car.getPhoto());
            preparedStatement.setString(9, car.getColor());
            preparedStatement.setInt(10, car.getIdCar());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
    }

    public List<BodyStyle> getBodyStyles() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<BodyStyle> bodyStyleList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_BODY_STYLE);
            resultSet = preparedStatement.executeQuery();
            bodyStyleList = initBodyStyles(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return bodyStyleList;
    }

    private List<BodyStyle> initBodyStyles(ResultSet resultSet) throws SQLException {
        List<BodyStyle> bodyStyleList = new ArrayList<BodyStyle>();
        while (resultSet.next()) {
            BodyStyle bodyStyle = new BodyStyle();
            bodyStyle.setIdBodyStyle(resultSet.getInt(1));
            bodyStyle.setNameBodyStyle(resultSet.getString(2));
            bodyStyleList.add(bodyStyle);
        }
        return bodyStyleList;
    }

    public void addCar(Car car) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_CAR);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, car.getBodyStyle());
            preparedStatement.setString(4, car.getFuelType());
            preparedStatement.setString(5, car.getYear());
            preparedStatement.setInt(6, car.getPrice());
            preparedStatement.setString(7, car.getDescription());
            preparedStatement.setString(8, car.getPhoto());
            preparedStatement.setString(9, car.getColor());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
    }

    private List<Car> initCars(ResultSet resultSet) throws SQLException {
        List<Car> carList = new ArrayList<Car>();
        while (resultSet.next()) {
            Car car = new Car();
            car.setIdCar(resultSet.getInt(1));
            car.setBrand(resultSet.getString(2));
            car.setModel(resultSet.getString(3));
            car.setBodyStyle(resultSet.getString(4));
            car.setFuelType(resultSet.getString(5));
            car.setYear(resultSet.getString(6));
            car.setPrice(resultSet.getInt(7));
            car.setDescription(resultSet.getString(8));
            car.setPhoto(resultSet.getString(9));
            car.setColor(resultSet.getString(10));
            carList.add(car);
        }
        return carList;
    }
}