/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryDirectory;
    
    public DeliveryManDirectory(){
        deliveryDirectory = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryDirectory() {
        return deliveryDirectory;
    }
    
    public DeliveryMan createNewDeliveryMan(String name, String userName, String password, String phoneNumber, String address){
        DeliveryMan res = new DeliveryMan(name, userName, password, phoneNumber,
                address);
        deliveryDirectory.add(res);
        return res;
    }
    
    public void deleteDeliveryMan(String username){
        ArrayList<DeliveryMan> custs = new ArrayList<DeliveryMan>();
        for(DeliveryMan del: deliveryDirectory){
            if(del.userName.equalsIgnoreCase(username)){
                custs.add(del);
            }
        }
        deliveryDirectory.removeAll(custs);
    }
    
    public void updateDeliveryMan(DeliveryMan del,String name, String userName, String password, String phoneNumber, String address){
                del.name = name;
                del.userName = userName;
                del.password = password;
                del.phoneNumber = phoneNumber;
                del.address = address;
        
    }
    
    public DeliveryMan getDeliveryMan(String userName){
        for(DeliveryMan del: deliveryDirectory){
            if(del.userName.equalsIgnoreCase(userName)){
                return del;
            }
        }
        return null;
    }

}
