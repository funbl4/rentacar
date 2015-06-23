package by.academy.it.to.impl;

import by.academy.it.to.IBodyStyleBean;

public class BodyStyleBean implements IBodyStyleBean {
    private int idBodyStyle;
    private String nameBodyStyle;

    public int getIdBodyStyle() {
        return idBodyStyle;
    }

    public void setIdBodyStyle(int idBodyStyle) {
        this.idBodyStyle = idBodyStyle;
    }

    public String getNameBodyStyle() {
        return nameBodyStyle;
    }

    public void setNameBodyStyle(String nameBodyStyle) {
        this.nameBodyStyle = nameBodyStyle;
    }
}
