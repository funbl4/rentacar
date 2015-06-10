package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;
import by.academy.it.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.academy.it.constants.Constants.*;

public class DeleteCarCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        CarService carService = new CarService();
/*        boolean flag = carService.deleteCar(Integer.valueOf(request.getParameter(PARAM_ID_CAR)));
        if (!flag) {
            *//*System.out.println("The car is not removed");*//*
        }*/
        return PAGE_INDEX;
    }
}
