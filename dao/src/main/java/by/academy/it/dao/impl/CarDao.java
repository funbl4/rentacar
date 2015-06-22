package by.academy.it.dao.impl;

import by.academy.it.dao.ICarDao;
import by.academy.it.pojo.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao extends BaseDao<Car> implements ICarDao{
}
