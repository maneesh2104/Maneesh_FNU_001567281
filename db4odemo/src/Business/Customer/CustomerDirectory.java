/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    public ArrayList<Customer> custDirectory;
    
    public CustomerDirectory(){
        custDirectory = new ArrayList<Customer>();
    }
    
    public Customer createNewCustomer(String name, String userName, String password){
        Customer cust = new Customer(name, userName, password);
        custDirectory.add(cust);
        return cust;
    }
    
    public void deleteCustomer(String username){
        ArrayList<Customer> custs = new ArrayList<Customer>();
        for(Customer cust: custDirectory){
            if(cust.userName.equalsIgnoreCase(username)){
                custs.add(cust);
            }
        }
        custDirectory.removeAll(custs);
    }
    
    public void updateCustomer(String name, String userName, String password){
        for(Customer cust: custDirectory){
            if(cust.userName.equalsIgnoreCase(userName)){
                cust.name = name;
                cust.userName = userName;
                cust.password = password;
            }
        }
    }
    
    public Customer getCustomer(String userName){
        for(Customer cust: custDirectory){
            if(cust.userName.equalsIgnoreCase(userName)){
                return cust;
            }
        }
        return null;
    }
    
    
}
