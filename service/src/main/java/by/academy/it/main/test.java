package by.academy.it.main;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;
import by.academy.it.service.IBodyStyleService;
import by.academy.it.service.impl.BodyStyleService;
import by.academy.it.service.impl.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        IBodyStyleService bodyStyleService = new BodyStyleService();
        BodyStyle bodyStyle = new BodyStyle("Sedan");
        bodyStyleService.addBodyStyle(bodyStyle);
    }
}


        /*Car car = new Car(22, "Жигули", "222", "2013", "Бежевый", "бензин", 1000, "Описание", "Фото");*/
//        car= carService.getCarByID(9);
//        BodyStyle bodyStyle = new BodyStyle();
//        bodyStyle.setNameBodyStyle("tfgf");
//        car.setBodyStyle(bodyStyle);
//        bodyStyle.setCar(car);
//
//        carService.addCar(car);

//User user = getUser(id);
//UserDetails userDetails = new UserDetails(firstName, lastName, telephone);
//user.setUserDetails(userDetails);
//        userDetails.setUser(user);