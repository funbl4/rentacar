package by.academy.it.service.impl;

import by.academy.it.dao.IUserDAO;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.pojo.User;
import by.academy.it.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
public class UserService implements IUserService{

    private static final Logger log = Logger.getLogger(UserService.class);

    @Autowired
    IUserDAO userDAO;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addUser(User user) {
        try {
            userDAO.saveOrUpdate(user);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void removeUser(User user) {
        try {
            userDAO.delete(user);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public User getUserById(Serializable id) {
        try {
            return userDAO.get(id);
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    public List<User> getUsers() {
        try {
            return userDAO.getAll();
        } catch (DaoException e) {
            e.printStackTrace();
            return null;
        }
    }
}