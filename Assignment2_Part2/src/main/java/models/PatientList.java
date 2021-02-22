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
public class PatientList {
    private ArrayList<Patient> patientList = new ArrayList<Patient>();

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient getPatient(String name){
        for (Patient patient: this.patientList){
            if (patient.getName().equalsIgnoreCase(name)){
                return patient;
            }
        }
        Patient newPatient = new Patient();
        newPatient.setName(name);
        patientList.add(newPatient);
        return newPatient;
    }
    
    
    
    
    
    
    
}
