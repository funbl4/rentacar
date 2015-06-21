package by.academy.it.service;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);
    List<Car> getCars();
}
