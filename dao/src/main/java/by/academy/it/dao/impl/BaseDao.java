package by.academy.it.dao.impl;

import by.academy.it.dao.Dao;
import by.academy.it.dao.exceptions.DaoException;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

@Repository
public class BaseDao<T> implements Dao<T> {

    private static Logger log = Logger.getLogger(BaseDao.class);

    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory pSessionFactory) {
        sessionFactory = pSessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }


    public void saveOrUpdate(T t) throws DaoException {
        try {
            getCurrentSession().saveOrUpdate(t);
            log.info("saveOrUpdate(t):" + t.getClass().getName());
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
    }

    public T get(Serializable id) throws DaoException {
        log.info("Get class by id:" + id);
        T t = null;
        try {
            t = (T) getCurrentSession().get(getPersistentClass(), id);
            log.info("get clazz:" + t.getClass().getName());
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return t;
    }

    public List<T> getAll() throws DaoException {
        List<T> list = Collections.emptyList();
        try {
            Criteria crit = getCurrentSession().createCriteria(getPersistentClass());
            crit.addOrder(Order.desc("id"));
            list = (List<T>) crit.list();

        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return list;
    }

    public T load(Serializable id) throws DaoException {
        log.info("Load class by id:" + id);
        T t = null;
        try {
            t = (T) getCurrentSession().load(getPersistentClass(), id);
            log.info("load() clazz:" + t.getClass().getName());
            getCurrentSession().isDirty();
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return t;
    }

    public void delete(T t) throws DaoException {
        try {
            getCurrentSession().delete(t);
            log.info("Delete:" + t.getClass().getName());
        } catch (HibernateException e) {
            log.error("Error delete " + t.getClass().getName() + " in Dao " + e);
            throw new DaoException(e);
        }
    }

    private Class getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
