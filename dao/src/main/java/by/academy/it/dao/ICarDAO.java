package by.academy.it.dao;

import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;

import java.util.List;

public interface ICarDAO extends IDAO<Car>{

    /*void addCar(Car car);*/

    Car getCarByID(Integer idCar) throws DaoException;

    /*boolean deleteCar(Integer idCar);

    void updateCar(Car car);*/

    List<BodyStyle> getBodyStyles();
}
