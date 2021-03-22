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
public class CityList {
    private ArrayList<City> cityList;
    
    
    public CityList(){
        cityList = new ArrayList<>();
    }
    
    
    public City getCity(String name){
        //Check if city with the name already exists
        
        for(City city: cityList){
            if(city.getName().equalsIgnoreCase(name)){
                // If city is found returning it
                return city;
            }
        }
        // If not found create a new city and return it
        City newCity = new City();
        newCity.setName(name);
        cityList.add(newCity);
        return newCity;
    }
    
    
}
