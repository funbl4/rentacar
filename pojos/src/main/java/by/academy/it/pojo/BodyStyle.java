package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "body_styles")
public class BodyStyle implements Serializable {

    private static final long serialVersionUID = 7381059213568659323L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_body_style", unique = true, nullable = false)
    private int idBodyStyle;

    @Column(name = "name_body_style")
    private String nameBodyStyle;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bodyStyle", cascade = CascadeType.ALL)
    public List<Car> carList;


    public BodyStyle() {
    }

    public BodyStyle(String nameBodyStyle) {
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
