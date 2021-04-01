/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> resDirectory;
    
    public RestaurantDirectory(){
        resDirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getResDirectory() {
        return resDirectory;
    }
    
    public Restaurant createNewRestaurant(String name, String userName, String password, String phoneNumber, String address){
        Restaurant res = new Restaurant(name, userName, password, phoneNumber, address);
        resDirectory.add(res);
        return res;
    }
    
    public void deleteRestaurant(String username){
        ArrayList<Restaurant> custs = new ArrayList<Restaurant>();
        for(Restaurant res: resDirectory){
            if(res.userName.equalsIgnoreCase(username)){
                custs.add(res);
            }
        }
        resDirectory.removeAll(custs);
    }
    
    public void updateRestaurant(Restaurant res,String name, String userName, String password, String phoneNumber, String address){
        res.name = name;
        res.userName = userName;
        res.password = password;
        res.phoneNumber = phoneNumber;
        res.address = address;
    }
    
    public Restaurant getRestaurant(String userName){
        for(Restaurant res: resDirectory){
            if(res.userName.equalsIgnoreCase(userName)){
                return res;
            }
        }
        return null;
    }
}
