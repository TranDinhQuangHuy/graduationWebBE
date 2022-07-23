package com.shop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderID;
    private Date orderDate;
    private Date deliveryDate;
    private Date recipientDate;
    private String reciver;
    private String phoneReciver;
    private String addressReciver;
    private String status;
    private Double amount;

    public Order() {
    }

    public Order(Long orderID, Date orderDate, Date deliveryDate, Date recipientDate, String reciver, String phoneReciver, String addressReciver, String status, Double amount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.recipientDate = recipientDate;
        this.reciver = reciver;
        this.phoneReciver = phoneReciver;
        this.addressReciver = addressReciver;
        this.status = status;
        this.amount = amount;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getRecipientDate() {
        return recipientDate;
    }

    public void setRecipientDate(Date recipientDate) {
        this.recipientDate = recipientDate;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public String getPhoneReciver() {
        return phoneReciver;
    }

    public void setPhoneReciver(String phoneReciver) {
        this.phoneReciver = phoneReciver;
    }

    public String getAddressReciver() {
        return addressReciver;
    }

    public void setAddressReciver(String addressReciver) {
        this.addressReciver = addressReciver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
