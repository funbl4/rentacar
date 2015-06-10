package by.academy.it.navigation;

import by.academy.it.pojo.Car;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.academy.it.constants.Constants.*;

public class GetCarCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        CarService carService = new CarService();
        Car car = carService.getCarByID(Integer.valueOf(request.getParameter(PARAM_ID_CAR)));
        request.setAttribute("car", car);
        return PAGE_GET_CAR;
    }
}
