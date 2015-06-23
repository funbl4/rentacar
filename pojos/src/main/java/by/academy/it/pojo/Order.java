package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 724613482989784981L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", unique = true, nullable = false)
    private int idOrder;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "order_status")
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name = "id_car")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Order() {
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (getIdOrder() != order.getIdOrder()) return false;
        if (getOrderDate() != null ? !getOrderDate().equals(order.getOrderDate()) : order.getOrderDate() != null)
            return false;
        if (getOrderStatus() != null ? !getOrderStatus().equals(order.getOrderStatus()) : order.getOrderStatus() != null)
            return false;
        if (getCar() != null ? !getCar().equals(order.getCar()) : order.getCar() != null) return false;
        return !(getUser() != null ? !getUser().equals(order.getUser()) : order.getUser() != null);

    }

    @Override
    public int hashCode() {
        int result = getIdOrder();
        result = 31 * result + (getOrderDate() != null ? getOrderDate().hashCode() : 0);
        result = 31 * result + (getOrderStatus() != null ? getOrderStatus().hashCode() : 0);
        result = 31 * result + (getCar() != null ? getCar().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", orderDate='" + orderDate + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", car=" + car +
                ", user=" + user + "\n" +
                '}';
    }
}
