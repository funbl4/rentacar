/*
package by.academy.it.navigation;

import by.academy.it.pojo.Car;
import by.academy.it.navigation.commands.Command;
import by.academy.it.service.impl.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.academy.it.constants.Constants.*;
import static by.academy.it.pojo.Role.ADMIN;
import static by.academy.it.pojo.Role.USER;

public class ListCarsCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CarService carService = new CarService();
        List<Car> carList = carService.getCars();
        String userRole = (String) request.getSession().getAttribute("userRole");
        request.setAttribute(PARAM_CARS, carList);
        try {
            if (userRole.equals(USER.toString().toUpperCase())) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_LIST_CARS);
                requestDispatcher.forward(request, response);
                return PAGE_LIST_CARS;
            } else if (userRole.equals(ADMIN.toString().toUpperCase())) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher(PAGE_ADMIN_LIST_CARS);
                requestDispatcher.forward(request, response);
               */
/* RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/admin/edit_list_cars.jsp");
                requestDispatcher.forward(request, response)*//*
;
                return PAGE_ADMIN_LIST_CARS;
            }
        }catch (NullPointerException e){
            return PAGE_LIST_CARS;
        }
        return PAGE_LIST_CARS;
    }
}
*/
