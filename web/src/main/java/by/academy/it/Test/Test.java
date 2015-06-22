package by.academy.it.Test;

import by.academy.it.dao.IBodyStyleDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.FuelType;
import by.academy.it.service.IBodyStyleService;
import by.academy.it.service.IFuelTypeService;
import by.academy.it.service.impl.BodyStyleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Leonid on 21.06.2015.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        IBodyStyleService bodyStyleService = (IBodyStyleService) context.getBean("bodyStyleService");
        IFuelTypeService fuelTypeService = (IFuelTypeService) context.getBean("fuelTypeService");
        FuelType fuelType = new FuelType("Diesel");
        FuelType fuelType1 = new FuelType("Shlyapa!!!!!");
        fuelTypeService.addFuelType(fuelType);
        fuelTypeService.addFuelType(fuelType1);
        System.out.println(fuelTypeService.getFuelTypeById(2));
        System.out.println(fuelTypeService.getListFuelType());
        fuelTypeService.removeFuelType(fuelType1);
        System.out.println(fuelTypeService.getListFuelType());
    }
}
