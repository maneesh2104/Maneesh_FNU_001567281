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
public class Patient extends Person{
    
    EncounterHistory patientEncounterHistory;
    
    public Patient(){
        patientEncounterHistory = new EncounterHistory();
        //history = new VitalSignsHistory();
    }
    
    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
    
    public double getAge(){
        return super.getAge();
    }
    
    public void setAge(double age){
        super.setAge(age);
    }
    
    public EncounterHistory getEncounterHistory(){
        return patientEncounterHistory;
    }
    
    
//    public void addVitalSign(VitalSigns sign){
//        history.addNewVitalList(sign);
//    }
    
    // Function to display patients vital sign history
    public void displayHistory() {
        System.out.println("----------------Printing history of vitals of " +
                this.getName().toUpperCase() + ":----------------");
        
        //Getting the vital history object and iterating through it
        int i = 0;
        
        for (Encounter encounter : patientEncounterHistory.encounterList) {
            System.out.println("\nRecord number: "+ ++i);
            System.out.println("Vital collect on Timestamp: " +
                    encounter.getTimestamp());
            double age = super.getAge();
            int resAge = 0;
            if (age < 1){
                resAge = (int) (age * 12);
                System.out.println("Age: " + resAge + " Months");
            }
            else{
                resAge = (int) (age);
                System.out.println("Age: " + resAge + " Years");
            }
            System.out.println("Respiratory rate: " + encounter.getVitalSign()
                    .getResporatoryRate());
            System.out.println("Heart rate: " + encounter.getVitalSign()
                    .getHeartRate());
            System.out.println("Blood pressure: " + encounter.getVitalSign()
                    .getBloodPressure());
            System.out.println("Weight in kgs: " + encounter.getVitalSign()
                    .getWeight());
            
        }
    }
    
    public VitalSigns getLatestVitalSign(){
        //Check if history object has any elements for IOB error
        if (!(patientEncounterHistory.encounterList.size() < 1)){
            return patientEncounterHistory.encounterList.get(patientEncounterHistory.encounterList.size() - 1).getVitalSign();
        }
        else{
            return null;
        }
    }
}