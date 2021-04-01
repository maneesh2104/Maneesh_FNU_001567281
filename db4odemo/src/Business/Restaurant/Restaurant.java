/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    String name;
    String password;
    String userName;
    String phoneNumber;
    String address;
    ArrayList<Dish> menu;
    ArrayList<Order> orders;
    int id=1;
    
    public Restaurant(String name, String userName, String password, String phoneNumber, String address){
        this.name = name;
        this.password = password;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        menu = new ArrayList<Dish>();
        orders = new ArrayList<Order>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Dish> getMenu() {
        if(menu == null){
            menu = new ArrayList<Dish>();
        }
        return menu;
    }
    
    public void newOrder(String orderId, String restaurantName, String customerName, String deliveryMan, ArrayList<Dish> order, String price, String deliveryAddress){
        Order newOrder = new Order(restaurantName, customerName, deliveryMan, price, "New", orderId, order);
        if(orders==null){
            orders = new ArrayList<Order>();
        }
        orders.add(newOrder);
    }

    public ArrayList<Order> getOrders() {
        if(orders==null){
            orders = new ArrayList<Order>();
        }
        return orders;
    }
    
    
    @Override
    public String toString() {
        return name;
    }
}
