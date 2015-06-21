package by.academy.it.main;

import by.academy.it.dao.IBodyStyleDao;
import by.academy.it.dao.ICarDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.dao.impl.BodyStyleDao;
import by.academy.it.dao.impl.CarDao;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        IBodyStyleDao bodyStyleDao = new BodyStyleDao();
        BodyStyle bodyStyle = new BodyStyle("Sedan");
        try {
            bodyStyleDao.saveOrUpdate(bodyStyle);
        } catch (DaoException e) {
            e.printStackTrace();
        }*/
/*        ICarDao carDao = new CarDao();
        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("318");
        car.setFuelType("Benz");
        car.setYear("2001");
        car.setPrice(199);
        car.setColor("black");
        car.setPhoto("Photo");
        car.setDescription("Descr");
        try {
            carDao.saveOrUpdate(car);
        } catch (DaoException e) {
            e.printStackTrace();
        }*/

    }

}
