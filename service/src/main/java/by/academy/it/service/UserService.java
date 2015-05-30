package by.academy.it.service;

import by.academy.it.dao.UserDAO;
import by.academy.it.dao.impl.UserDAOImpl;
import by.academy.it.entity.User;

import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAOImpl();
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    public User getUserByID(int idUser){
        return userDAO.getUserByID(idUser);
    }

    public User getUserByEmail(String email){
        return userDAO.getUserByEmail(email);
    }

    public boolean loginUser(String login, String password) {
        return userDAO.loginUser(login, password);
    }
}

