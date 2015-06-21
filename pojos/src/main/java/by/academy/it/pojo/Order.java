package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 724613482989784981L;

    private int idOrder;
    private String date;
    private int price;
    private String orderStatus;

    private String car;
    private String customer;

    public Order() {
    }

    public Order(String car, String customer, String date, int price, String orderStatus) {
        this.car = car;
        this.customer = customer;
        this.date = date;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }




    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", customer=" + customer +
                ", date='" + date + '\'' +
                ", car=" + car +
                ", orderStatus='" + orderStatus + '\'' +
                ", price=" + price +
                '}';
    }
}
