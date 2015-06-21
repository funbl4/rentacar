package by.academy.it.dao.impl;

import by.academy.it.dao.IBodyStyleDao;
import by.academy.it.pojo.BodyStyle;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BodyStyleDao extends BaseDao<BodyStyle> implements IBodyStyleDao{

    private static Logger log = Logger.getLogger(BaseDao.class);

    @Autowired
    public BodyStyleDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
