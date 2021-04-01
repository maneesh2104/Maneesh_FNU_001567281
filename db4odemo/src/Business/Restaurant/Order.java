/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class Order {
    ArrayList<Dish> orderItems;
    String restuarantUserName;
    String customerUserName;
    String deliveryName;
    String totalPrice;
    String status;
    String id;
    
    public Order(String restuarantUserName, String customerUserName,  String deliveryName, String totalPrice, String status,  String id , ArrayList<Dish> orderItems){
        this.customerUserName = customerUserName;
        this.deliveryName = deliveryName;
        this.id = id;
        this.status = status;
        this.restuarantUserName = restuarantUserName;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
    }

    public ArrayList<Dish> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<Dish> orderItems) {
        this.orderItems = orderItems;
    }

    public String getRestuarantUserName() {
        return restuarantUserName;
    }

    public void setRestuarantUserName(String restuarantUserName) {
        this.restuarantUserName = restuarantUserName;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return id;
    }
    
    
}
