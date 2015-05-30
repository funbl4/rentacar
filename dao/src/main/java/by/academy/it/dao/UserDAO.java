package by.academy.it.dao;

import by.academy.it.entity.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);

    List<User> getUsers();

    User getUserByID(Integer idUser);

    User getUserByEmail(String email);

    boolean loginUser(String login, String password);

    boolean logoutUser();
}
