package by.academy.it.navigation;

import by.academy.it.entity.Car;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static by.academy.it.constants.Constants.*;

public class ListCarsCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        CarService carService = new CarService();
        List<Car> carList = carService.getCars();
        request.setAttribute(PARAM_CARS, carList);
        return PAGE_LIST_CARS;
    }
}
