package by.academy.it.pojo;

public class BodyStyle {
    private int idBodyStyle;
    private String nameBodyStyle;

    public BodyStyle() {
    }

    public BodyStyle(int idBodyStyle, String nameBodyStyle) {
        this.idBodyStyle = idBodyStyle;
        this.nameBodyStyle = nameBodyStyle;
    }

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

    @Override
    public String toString() {
        return "BodyStyle{" +
                "idBodyStyle=" + idBodyStyle +
                ", nameBodyStyle='" + nameBodyStyle + '\'' +
                '}';
    }
}
