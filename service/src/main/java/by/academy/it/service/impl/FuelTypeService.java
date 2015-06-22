package by.academy.it.service.impl;

import by.academy.it.dao.IFuelTypeDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.FuelType;
import by.academy.it.service.IFuelTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public class FuelTypeService implements IFuelTypeService {

    private static final Logger log = Logger.getLogger(FuelTypeService.class);

    @Autowired
    IFuelTypeDao fuelTypeDao;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addFuelType(FuelType fuelType) {
        try {
            fuelTypeDao.saveOrUpdate(fuelType);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void removeFuelType(FuelType fuelType) {
        try {
            fuelTypeDao.delete(fuelType);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public FuelType getFuelTypeById(Serializable id) {
        try {
            return fuelTypeDao.get(id);
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<FuelType> getFuelTypes() {
        try {
            return fuelTypeDao.getAll();
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }
}