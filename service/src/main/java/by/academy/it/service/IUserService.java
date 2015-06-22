package by.academy.it.service;

import by.academy.it.pojo.User;

import java.io.Serializable;
import java.util.List;

public interface IUserService {

    void addUser(User user);

    void removeUser (User user);

    User getUserById(Serializable id);

    List<User> getListUser();

}
