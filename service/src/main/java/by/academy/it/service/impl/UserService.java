package by.academy.it.service.impl;

import by.academy.it.dao.IUserDAO;
import by.academy.it.dao.impl.UserDAOImpl;
import by.academy.it.pojo.User;

import java.util.List;

public class UserService {

    private IUserDAO IUserDAO;

    public UserService() {
        IUserDAO = new UserDAOImpl();
    }

    public void addUser(User user) {
        IUserDAO.addUser(user);
    }

    public List<User> getUsers() {
        return IUserDAO.getUsers();
    }

    public User getUserByID(int idUser){
        return IUserDAO.getUserByID(idUser);
    }

    public User getUserByEmail(String email){
        return IUserDAO.getUserByEmail(email);
    }

    public boolean loginUser(String login, String password) {
        return IUserDAO.loginUser(login, password);
    }
}

