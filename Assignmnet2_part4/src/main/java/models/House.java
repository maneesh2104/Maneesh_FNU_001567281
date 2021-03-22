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
public class House {
    ArrayList<Patient> personList;
    int houseNumeber;
    
    public House(){
        personList = new ArrayList<>();
    }

    public ArrayList<Patient> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Patient> personList) {
        this.personList = personList;
    }

    public int getHouseNumeber() {
        return houseNumeber;
    }

    public void setHouseNumeber(int houseNumeber) {
        this.houseNumeber = houseNumeber;
    }
    
}
