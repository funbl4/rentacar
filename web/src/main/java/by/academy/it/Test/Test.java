package by.academy.it.Test;

import by.academy.it.dao.IBodyStyleDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;
import by.academy.it.pojo.FuelType;
import by.academy.it.pojo.User;
import by.academy.it.service.IBodyStyleService;
import by.academy.it.service.ICarService;
import by.academy.it.service.IFuelTypeService;
import by.academy.it.service.IUserService;
import by.academy.it.service.impl.BodyStyleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        IBodyStyleService bodyStyleService = (IBodyStyleService) context.getBean("bodyStyleService");
        IFuelTypeService fuelTypeService = (IFuelTypeService) context.getBean("fuelTypeService");
        IUserService userService = (IUserService) context.getBean("userService");
        ICarService carService = (ICarService) context.getBean("carService");

/*        Car car = new Car();
        car.setBrand("BMW");
        car.setModel("318");
        car.setYear("2009");
        car.setPrice(10000);
        car.setColor("Black");
        car.setDescription("Description");
        car.setPhoto("photo");
        car.setFuelType(fuelTypeService.getFuelTypeById(2));
        car.setBodyStyle(bodyStyleService.getBodyStyleById(2));
        carService.addCar(car);

        System.out.println(carService.getCars());*/
/*
        FuelType fuelType = new FuelType("Diesel");
        FuelType fuelType1 = new FuelType("Shlyapa!!!!!");
        fuelTypeService.addFuelType(fuelType);
        fuelTypeService.addFuelType(fuelType1);
        System.out.println(fuelTypeService.getFuelTypeById(2));
        System.out.println(fuelTypeService.getFuelTypes());
        fuelTypeService.removeFuelType(fuelType1);
        System.out.println(fuelTypeService.getFuelTypes());*/
    }
}
