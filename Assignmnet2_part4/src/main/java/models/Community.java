/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author maneesh
 */
public class Community {
    private ArrayList<House> houseList;
    private String name;
    
    public Community(){
        houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setCityList(ArrayList<House> cityList) {
        this.houseList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public House getHouse(int number){
        for(House house: houseList){
            if(house.getHouseNumeber() == number){
                return house;
            }
        }
        
        House newHouse = new House();
        newHouse.setHouseNumeber(number);
        houseList.add(newHouse);
        
        return newHouse;
    }
        
}
