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
public class VitalSigns {
    int resporatoryRate;
    int heartRate;
    int bloodPressure;
    double weight;
    double age;
    
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getResporatoryRate() {
        return resporatoryRate;
    }

    public void setResporatoryRate(int resporatoryRate) {
        this.resporatoryRate = resporatoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public boolean isThisVitalSignNormal(String signType){
        
        //Check what is the selected vital sigh type
        
        switch (signType.toLowerCase()){
            
            case "respiratoryrate":
                return isRespiratoryRateNormal();
            case "heartrate":
                return isHeartRateNoraml();
            case "bloodpressure":
                return isBloodPressureNormal();
            case "weight":
                return isWeightNormal();
            default:
                return false;
        }
        
    }
    
    public boolean isRespiratoryRateNormal(){
        double age = this.age;
        System.out.println("Respiratory rate of the patient is " + resporatoryRate);

        
        if (age == 0){
            if (resporatoryRate >= 30 && resporatoryRate <= 50){
                return true;
            }
            else {
                return false;
            }    
        }
        else if(age <= 1){
            if (resporatoryRate >= 20 && resporatoryRate <= 30){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=2 && age <=3){
            if (resporatoryRate >= 20 && resporatoryRate <= 30){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >3 && age <=5){
            if (resporatoryRate >= 20 && resporatoryRate <= 30){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=6 && age <=12){
            if (resporatoryRate >= 20 && resporatoryRate <= 30){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            if (resporatoryRate >= 12 && resporatoryRate <= 20){
                return true;
            }
            else {
                return false;
            }
        }
        
    }
        


    private boolean isHeartRateNoraml() {
        double age = this.age;
        System.out.println("Heart rate of the patient is " + heartRate);
        
        if (age == 0){
            if (heartRate >= 120 && heartRate <= 160){
                return true;
            }
            else if(age == 1){
                return false;
            }    
        }
        else if(age <= 1){
            if (heartRate >= 80 && resporatoryRate <= 140){
                return true;
            }
            else if(age == 1){
                return false;
            }
        }
        else if(age >=2 && age <=3){
            if (heartRate >= 80 && heartRate <= 130){
                return true;
            }
            else if(age == 1){
                return false;
            }
        }
        else if(age >3 && age <=5){
            if (heartRate >= 80 && heartRate <= 120){
                return true;
            }
            else if(age == 1){
                return false;
            }
        }
        else if(age >=6 && age <= 12){
            if (heartRate >= 70 && heartRate <= 110){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (resporatoryRate >= 55 && resporatoryRate <= 105){
                return true;
            }
            else if(age == 1){
                return false;
            }
        }
        
        return false;
    }

    private boolean isBloodPressureNormal() {
        double age = this.age;
        System.out.println("Blood Pressure of the patient is " + bloodPressure);
       
        if (age == 0){
            if (bloodPressure >= 50 && bloodPressure <= 70){
                return true;
            }
            else {
                return false;
            }    
        }
        else if(age <= 1){
            if (bloodPressure >= 70 && bloodPressure <= 100){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=2 && age <=3){
            if (bloodPressure >= 80 && bloodPressure <= 110){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >3 && age <=5){
            if (bloodPressure >= 80 && bloodPressure <= 110){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=6 && age <= 12){
            if (bloodPressure >= 80 && bloodPressure <= 120){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (bloodPressure >= 110 && bloodPressure <= 120){
                return true;
            }
            else {
                return false;
            }
        }
        
    }

    private boolean isWeightNormal() {
        double age = this.age;
        System.out.println("Weight of the patient is" + weight);

        
        if (age == 0){
            if (weight >= 2 && weight <= 3){
                return true;
            }
            else {
                return false;
            }    
        }
        else if(age <= 1){
            if (weight >= 4 && weight <= 10){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=2 && age <=3){
            if (weight >= 10 && weight <= 14){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >3 && age <=5){
            if (weight >= 14 && weight <= 18){
                return true;
            }
            else {
                return false;
            }
        }
        else if(age >=6 && age <= 12){
            if (weight >= 20 && weight <= 42){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (weight > 50){
                return true;
            }
            else {
                return false;
            }
        }
        
    }
    
    
}
