package by.academy.it.service.impl;

import by.academy.it.dao.IBodyStyleDao;
import by.academy.it.dao.exceptions.DaoException;
import by.academy.it.dao.impl.BodyStyleDao;
import by.academy.it.pojo.BodyStyle;
import by.academy.it.service.IBodyStyleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service

public class BodyStyleService implements IBodyStyleService {

    private static final Logger log = Logger.getLogger(BodyStyleService.class);

    @Autowired
    IBodyStyleDao bodyStyleDao;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addBodyStyle(BodyStyle bodyStyle) {
        try {
            bodyStyleDao.saveOrUpdate(bodyStyle);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }
}
