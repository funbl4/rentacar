package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

    private static final long serialVersionUID = 6125174013568659323L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int idCar;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private String year;
    @Column(name = "color")
    private String color;
    @Column(name = "fuel_type")
    private String fuelType;
    @Column(name = "body_style")
    private String bodyStyle;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
    @Column(name = "photo")
    private String photo;


    public Car() {
    }

    public Car(String brand, String model, String year, String color, String fuelType, String bodyStyle, int price, String description, String photo) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
        this.bodyStyle = bodyStyle;
        this.price = price;
        this.description = description;
        this.photo = photo;
    }

    public Car(int idCar, String brand, String model, String year, String color, String fuelType, String bodyStyle, int price, String description, String photo) {
        this.idCar = idCar;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
        this.bodyStyle = bodyStyle;
        this.price = price;
        this.description = description;
        this.photo = photo;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (idCar != car.idCar) return false;
        if (price != car.price) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (year != null ? !year.equals(car.year) : car.year != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        if (fuelType != null ? !fuelType.equals(car.fuelType) : car.fuelType != null) return false;
        if (bodyStyle != null ? !bodyStyle.equals(car.bodyStyle) : car.bodyStyle != null) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        return !(photo != null ? !photo.equals(car.photo) : car.photo != null);

    }

    @Override
    public int hashCode() {
        int result = idCar;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (bodyStyle != null ? bodyStyle.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
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
                ", fuelType='" + fuelType + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
