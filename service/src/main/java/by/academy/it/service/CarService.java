package by.academy.it.service;

import by.academy.it.dao.CarDAO;
import by.academy.it.dao.impl.CarsDAOImpl;
import by.academy.it.entity.BodyStyle;
import by.academy.it.entity.Car;

import java.util.List;

public class CarService {

    private CarDAO carDAO;

    public CarService() {
        carDAO = new CarsDAOImpl();
    }

    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    public List<Car> getCars() {
        return carDAO.getCars();
    }

    public Car getCarByID(Integer idCar) {
        return carDAO.getCarByID(idCar);
    }

    public Boolean deleteCar(Integer idCar) {
        return carDAO.deleteCar(idCar);
    }

    public void updateCar(Car car) {
        carDAO.updateCar(car);
    }

    public List<BodyStyle> getBodyStyles() {
        return carDAO.getBodyStyles();
    }
}
