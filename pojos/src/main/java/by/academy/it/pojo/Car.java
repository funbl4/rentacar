package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID = 6125174013568659323L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car", unique = true, nullable = false)
    private int idCar;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private String year;
    @Column(name = "color")
    private String color;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "photo")
    private String photo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "car", cascade = CascadeType.ALL)
    private List<Order> orderList;

    @ManyToOne
    @JoinColumn(name = "id_fuel_type")
    private FuelType fuelType;

    @ManyToOne
    @JoinColumn(name = "id_body_style")
    private BodyStyle bodyStyle;

    public Car() {
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public BodyStyle getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(BodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (getIdCar() != car.getIdCar()) return false;
        if (getPrice() != car.getPrice()) return false;
        if (getBrand() != null ? !getBrand().equals(car.getBrand()) : car.getBrand() != null) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        if (getYear() != null ? !getYear().equals(car.getYear()) : car.getYear() != null) return false;
        if (getColor() != null ? !getColor().equals(car.getColor()) : car.getColor() != null) return false;
        if (getDescription() != null ? !getDescription().equals(car.getDescription()) : car.getDescription() != null)
            return false;
        if (getPhoto() != null ? !getPhoto().equals(car.getPhoto()) : car.getPhoto() != null) return false;
        if (getOrderList() != null ? !getOrderList().equals(car.getOrderList()) : car.getOrderList() != null)
            return false;
        if (getFuelType() != null ? !getFuelType().equals(car.getFuelType()) : car.getFuelType() != null) return false;
        return !(getBodyStyle() != null ? !getBodyStyle().equals(car.getBodyStyle()) : car.getBodyStyle() != null);

    }

    @Override
    public int hashCode() {
        int result = getIdCar();
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + getPrice();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getPhoto() != null ? getPhoto().hashCode() : 0);
        result = 31 * result + (getOrderList() != null ? getOrderList().hashCode() : 0);
        result = 31 * result + (getFuelType() != null ? getFuelType().hashCode() : 0);
        result = 31 * result + (getBodyStyle() != null ? getBodyStyle().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                ", fuelType=" + fuelType +
                ", bodyStyle=" + bodyStyle + "\n" +
                '}';
    }
}
