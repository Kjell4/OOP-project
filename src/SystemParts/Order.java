package SystemParts;

import Enums.OrderType;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String title;
    private String content;
    private String idFrom;
    private Date date;
    private OrderType orderType;
    private String status;

    public Order() {

    }
    public Order(String title, String content,String idFrom, OrderType orderType) {
        this.title = title;
        this.content = content;
        this.idFrom = idFrom;
        this.orderType = orderType;
        this.date = new Date();
        this.status = "pending";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIdFrom() {
        return idFrom;
    }

    public void setIdFrom(String idFrom) {
        this.idFrom = idFrom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "title=" + title + '\n' +
                ", content=" + content + '\n' +
                ", idFrom=" + idFrom + '\n' +
                ", date=" + date + '\n' +
                ", orderType=" + orderType +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getTitle(), order.getTitle())
                && Objects.equals(getContent(), order.getContent())
                && Objects.equals(getIdFrom(), order.getIdFrom())
                && Objects.equals(getDate(), order.getDate())
                && getOrderType() == order.getOrderType()
                && Objects.equals(getStatus(), order.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getContent(), getIdFrom(), getDate(), getOrderType(), getStatus());
    }
}
