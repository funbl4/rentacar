package by.academy.it.dao;

import by.academy.it.entity.BodyStyle;
import by.academy.it.entity.Car;

import java.util.List;

public interface CarDAO {

    void addCar(Car car);

    List<Car> getCars();

    Car getCarByID(Integer idCar);

    boolean deleteCar(Integer idCar);

    void updateCar(Car car);

    List<BodyStyle> getBodyStyles();
}
