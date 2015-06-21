package by.academy.it.navigation;

import by.academy.it.constants.Constants;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static by.academy.it.constants.Constants.PAGE_ADD_CAR;

public class AddCarCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        CarService carService = new CarService();
        List<BodyStyle> bodyStyleList = carService.getBodyStyles();
        request.setAttribute(Constants.PARAM_BODY_STYLES, bodyStyleList);
        return PAGE_ADD_CAR;
    }
}
