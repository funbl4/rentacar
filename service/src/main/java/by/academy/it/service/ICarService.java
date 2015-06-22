package by.academy.it.service;

import by.academy.it.pojo.Car;

import java.io.Serializable;
import java.util.List;

public interface ICarService {

    void addCar(Car car);

    void removeCar (Car car);

    Car getCarById(Serializable id);

    List<Car> getCars();

}
