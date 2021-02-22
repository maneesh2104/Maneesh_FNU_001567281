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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isPatientNormal(VitalSigns vitalSigns){
        double weight = vitalSigns.getWeight();
        double age = vitalSigns.getAge();
        int heartRate = vitalSigns.getHeartRate();
        int bloodPressure = vitalSigns.getBloodPressure();
        int resporatoryRate = vitalSigns.getResporatoryRate();
        
        if (vitalSigns.getAge() == 0){
            if (resporatoryRate >= 30 && resporatoryRate <= 50 && heartRate >=120 && heartRate <= 160 && bloodPressure >=50 && bloodPressure<=70 && weight >=2 && weight <=3){
                System.out.println("Legal");
                 return true;
            }
            else{
                System.out.println("Illegal");
                return false;
            }

        }
        else if (vitalSigns.getAge() <= 1){
            if (resporatoryRate >= 20 && resporatoryRate <= 30 && heartRate >=80 && heartRate <= 140 && bloodPressure >=70 && bloodPressure<=100 && weight >=4 && weight <=10){
                return true;
            }
            else{
                return false;
            }
        }
        else if(age >=2 && age <=3){
            if (resporatoryRate >= 20 && resporatoryRate <= 30 && heartRate >=80 && heartRate <= 130 && bloodPressure >=80 && bloodPressure<=110 && weight >=10 && weight <=14){
                return true;
            }
            else{
                return false;
            }
        }
        else if(age >=3 && age <=5){
                if (resporatoryRate >= 20 && resporatoryRate <= 30 && heartRate >=80 && heartRate <= 120 && bloodPressure >=80 && bloodPressure<=110 && weight >=14 && weight <=18){
                return true;
            }
            else{
                return false;
            }
        }
        else if(age >=6 && age <=12){
                if (resporatoryRate >= 20 && resporatoryRate <= 30 && heartRate >=70 && heartRate <= 110 && bloodPressure >=80 && bloodPressure<=120 && weight >=20 && weight <=42){
                return true;
            }
            else{
                return false;
            }
        }
        else if(age >= 13){
                if (resporatoryRate >= 12 && resporatoryRate <= 20 && heartRate >=55 && heartRate <= 105 && bloodPressure >=110 && bloodPressure<=120 && weight > 50){
                return true;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}
