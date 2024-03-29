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
    
    // Function to display patients vital sign history
    public void displayHistory() {
        System.out.println("----------------Printing history of vitals of " + this.getName().toUpperCase() + ":----------------");
        
        //Getting the vital history object and iterating through it
        int i = 0;
        for (VitalSigns sign : history.history) {
            System.out.println("\nRecord number: "+ ++i);
            System.out.println("Vital collect on Timestamp: " + sign.timestamp);
            double age = sign.getAge();
            int resAge = 0;
            if (age < 1){
                resAge = (int) (age * 12);
                System.out.println("Age: " + resAge + " Months");

            }
            else{
                resAge = (int) (age);
                System.out.println("Age: " + resAge + " Years");
            }
            System.out.println("Respiratory rate: " + sign.getResporatoryRate());
            System.out.println("Heart rate: " + sign.getHeartRate());
            System.out.println("Blood pressure: " + sign.getBloodPressure());
            System.out.println("Weight in kgs: " + sign.getWeight());
            
        }
    }
    
    public VitalSigns getLatestVitalSign(){
        //Check if history object has any elements for IOB error
        if (!(history.history.size() < 1)){
            return history.history.get(history.history.size() - 1);
        }
        else{
            return null;
        }
    }
}