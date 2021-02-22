/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author maneesh
 */
public class Patient {
    private String name;
    private VitalSignsHistory history;
    
    public Patient(){
        history = new VitalSignsHistory();
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addVitalSign(VitalSigns sign){
        history.addNewVitalList(sign);
    }
    
    public void displayHistory() {
        System.out.println("----------------Printing history of vitals of " + this.getName().toUpperCase() + ":----------------");
        for (VitalSigns sign : history.history) {
            System.out.println("\nAge: " + sign.getAge());
            System.out.println("Respiratory rate: " + sign.getResporatoryRate());
            System.out.println("Heart rate: " + sign.getHeartRate());
            System.out.println("Blood pressure: " + sign.getBloodPressure());
            System.out.println("Weight in kgs: " + sign.getWeight());
        }
    }
}