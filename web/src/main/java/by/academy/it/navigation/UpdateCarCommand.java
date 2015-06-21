package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.academy.it.constants.Constants.*;

public class UpdateCarCommand implements Command {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String brand = request.getParameter(PARAM_BRAND);
        String model = request.getParameter(PARAM_MODEL);
        String year = request.getParameter(PARAM_YEAR);
        String color = request.getParameter(PARAM_COLOR);
        String fuelType = request.getParameter(PARAM_FUEL_TYPE);
        String bodyStyle = request.getParameter(PARAM_BODY_STYLE);
        int price = Integer.valueOf(request.getParameter(PARAM_PRICE));
        String description = request.getParameter(PARAM_DESCRIPTION);
        String photo = request.getParameter(PARAM_PHOTO);
        int idCar = Integer.valueOf(request.getParameter(PARAM_ID_CAR));
        //Car car = new Car(idCar, brand, model, year, color, fuelType, bodyStyle, price, description, photo);
        CarService carService = new CarService();
        //carService.updateCar(car);
        return PAGE_ADMIN_PAGE;
    }
}
