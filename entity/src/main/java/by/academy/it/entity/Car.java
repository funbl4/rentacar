package by.academy.it.entity;

public class Car extends AbstractEntity {
    private static final long serialVersionUID = 6125174013568659323L;

    private int idCar;
    private String brand;
    private String model;
    private String year;
    private String color;
    private String fuelType;
    private String bodyStyle;
    private int price;
    private String description;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
