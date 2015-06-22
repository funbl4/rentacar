package by.academy.it.service;

import by.academy.it.pojo.BodyStyle;

import java.io.Serializable;
import java.util.List;

public interface IBodyStyleService {

    void addBodyStyle(BodyStyle bodyStyle);

    void removeBodyStyle (BodyStyle bodyStyle);

    BodyStyle getBodyStyleById(Serializable id);

    List<BodyStyle> getBodyStyles();

}
