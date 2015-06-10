package by.academy.it.dao;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;

import java.util.List;

public interface ICarDAO extends IDAO<Car>{

    /*void addCar(Car car);

    List<Car> getCars();*/

    Car getCarByID(Integer idCar);

    /*boolean deleteCar(Integer idCar);

    void updateCar(Car car);*/

    List<BodyStyle> getBodyStyles();
}
