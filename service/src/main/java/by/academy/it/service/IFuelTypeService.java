package by.academy.it.service;

import by.academy.it.pojo.FuelType;

import java.io.Serializable;
import java.util.List;

public interface IFuelTypeService {

    void addFuelType(FuelType fuelType);

    void removeFuelType (FuelType fuelType);

    FuelType getFuelTypeById(Serializable id);

    List<FuelType> getListFuelType();

}
