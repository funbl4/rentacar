package by.academy.it.service.impl;

import by.academy.it.dao.ICarDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.Car;
import by.academy.it.service.ICarService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class CarService implements ICarService {

    private static Logger log = Logger.getLogger(CarService.class);

    @Autowired
    private ICarDao carDAO;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addCar(Car car) {
        try {
            carDAO.saveOrUpdate(car);
            log.info("Save or update (commit)");
        } catch (DaoException e) {
            log.error("Error save or update news in Dao" + e);
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<Car> getCars() {
        try {
            log.info("Get all cars (commit)");
            return carDAO.getAll();
        } catch (DaoException e) {
            log.error("Error get cars in Dao" + e);
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
