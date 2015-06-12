package by.academy.it.service;

import by.academy.it.dao.ICarDAO;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.dao.impl.CarsDAOImplI;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;

import java.util.Collections;
import java.util.List;

public class CarService {

    private ICarDAO carDAO;

    public CarService() {
        carDAO = new CarsDAOImplI();
    }

    public void addCar(Car car) {
        try {
            carDAO.saveOrUpdate(car);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    public List<Car> getCars() {
        try {
            return carDAO.getAll();
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public Car getCarByID(Integer idCar) {
        try {
            return carDAO.getCarByID(idCar);
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return null;
        /*return carDAO.getCarByID(idCar);*/
    }

/*    public Boolean deleteCar(Integer idCar) {
        return carDAO.deleteCar(idCar);
    }

    public void updateCar(Car car) {
        carDAO.updateCar(car);
    }*/

    public List<BodyStyle> getBodyStyles() {
        return carDAO.getBodyStyles();
    }
}
