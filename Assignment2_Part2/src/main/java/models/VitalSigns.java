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
    
//    public VitalSigns(int resporatoryRate, int heartRate, int bloodPressure, double weight, double age){
//        this.resporatoryRate = resporatoryRate;
//        this.heartRate = heartRate;
//        this.bloodPressure = bloodPressure;
//        this.weight = weight;
//        this.age = age;
//    }
    
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
    
}
