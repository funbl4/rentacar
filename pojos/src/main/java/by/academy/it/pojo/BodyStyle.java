package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "body_styles")
public class BodyStyle implements Serializable {

    private static final long serialVersionUID = 7381059213568659323L;

    @Id
    @Column(name = "id_body_style")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBodyStyle;
    @Column(name = "name_body_style")
    private String nameBodyStyle;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Car car;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BodyStyle bodyStyle = (BodyStyle) o;

        if (idBodyStyle != bodyStyle.idBodyStyle) return false;
        return !(nameBodyStyle != null ? !nameBodyStyle.equals(bodyStyle.nameBodyStyle) : bodyStyle.nameBodyStyle != null);

    }

    @Override
    public int hashCode() {
        int result = idBodyStyle;
        result = 31 * result + (nameBodyStyle != null ? nameBodyStyle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BodyStyle{" +
                "idBodyStyle=" + idBodyStyle +
                ", nameBodyStyle='" + nameBodyStyle + '\'' +
                '}';
    }
}
