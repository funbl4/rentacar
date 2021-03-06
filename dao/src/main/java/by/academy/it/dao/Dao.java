package by.academy.it.dao;

import by.academy.it.dao.exceptions.DaoException;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {

    void saveOrUpdate(T t) throws DaoException;

    T get(Serializable id) throws DaoException;

    List<T> getAll() throws DaoException;

    T load(Serializable id) throws DaoException;

    void delete(T t) throws DaoException;

}
