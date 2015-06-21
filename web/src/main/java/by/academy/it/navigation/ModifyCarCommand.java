package by.academy.it.navigation;

import by.academy.it.pojo.BodyStyle;
import by.academy.it.pojo.Car;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static by.academy.it.constants.Constants.*;

public class ModifyCarCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        CarService carService = new CarService();
        Car car = carService.getCarByID(Integer.valueOf(request.getParameter(PARAM_ID_CAR)));
        List<BodyStyle> bodyStyleList = carService.getBodyStyles();
        request.setAttribute(PARAM_BODY_STYLES, bodyStyleList);
        request.setAttribute(PARAM_CAR, car);
        return PAGE_MODIFY_CAR;
    }
}
