/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import models.Encounter;
import models.Patient;
import models.PatientList;
import models.VitalSigns;

/**
 *
 * @author maneesh
 */
public class TestClass {
    
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        

        System.out.println("----------------Welcome to patient dashboard----------------");
        displayInputMessages();

        Scanner scanner = new Scanner(System.in);
        int userChoice = 1;
        

        while (userChoice != 4) {
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    if (patientList.getPatientList().isEmpty()){
                        System.out.println("No patients currently present");
                        displayInputMessages();
                        break;
                    }
                    System.out.println("Please enter patient name for whom you want the view history of");
                    String patientNameGet = scanner.next();
                    Patient patientGet = patientList.getPatient(patientNameGet, true);
                    if (patientGet == null){
                        System.out.println("Patient with that name does not exist");
                        displayInputMessages();
                        break;
                    }
                    patientGet.displayHistory();
                    displayInputMessages();
                    break;

                case 2:
                    addVitalSign(scanner, patientList);
                    displayInputMessages();
                    break;
                case 3:
                    boolean result = checkPatientVitals(scanner, patientList);
                    if (result == true){
                        System.out.println("Valid Vital sign");
                    }
                    else{
                        System.out.println("Invalid Vital sign");
                    }
                    displayInputMessages();
                    break;
                default:
                    System.out.println("Please check the options and try again!! INVALID INPUT!!");
                    
            }
                
            }
        System.out.println("Thank you, please do visit us again!");
        
        }

    private static boolean checkPatientVitals(Scanner scanner, PatientList patientList) {
        //Function checks the vital signs.
        boolean result = false;
        System.out.println("----------Checking Vitals signs for patient----------");
        
        //Get patient name
        System.out.println("Enter patient name");
        String patientName = scanner.next();
        Patient patient = patientList.getPatient(patientName, true);
        if (patient == null){
            System.out.println("No patient with this name exists");
            return false;
        }
    
        System.out.println("Hi " + patientName.toUpperCase() + " welcome to the checking portal");
        System.out.println("Please enter the vital sign you want to check: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"Weight\"");
        
        //Get latest Vital sign
        VitalSigns latestSign = patient.getLatestVitalSign();
        if (latestSign == null){
            System.out.println("No vital sign object present!!!!");
            return false;
        }
                
        String selectedVitalString = scanner.next();
        
        if (selectedVitalString.equalsIgnoreCase("RespiratoryRate")){
            return latestSign.isThisVitalSignNormal("RespiratoryRate");
        }
        else if(selectedVitalString.equalsIgnoreCase("HeartRate")) {
            return latestSign.isThisVitalSignNormal("HeartRate");
        }
        else if (selectedVitalString.equalsIgnoreCase("BloodPressure")){
            return latestSign.isThisVitalSignNormal("BloodPressure");
        }
        else if (selectedVitalString.equalsIgnoreCase("Weight")) {
             return latestSign.isThisVitalSignNormal("Weight");
        }
        return false;
        
    }


    private static void displayInputMessages() {
        // Function to display user input menu
        System.out.println("\nSelect from below options: ");
        System.out.println("\t 1 - View existing records. ");
        System.out.println("\t 2 - Add a new record.");
        System.out.println("\t 3 - Check vital sign status");
        System.out.println("\t 4 - To Quit the application.");
        
    }
    
    private static void addVitalSign(Scanner scanner, PatientList patientList) {
        //Function to add vital sign
        System.out.println("-----------Patient Details-----------");
        System.out.println("Please enter patient name");
        String patientName = scanner.next();
        
        
        Patient patient = patientList.getPatient(patientName, false);
        System.out.println("-----------Vital Sign Details-----------");
        System.out.println("Please enter vital signs");
        
        //Intitalinzing the Vital Sign object
        VitalSigns vitalSigns = new VitalSigns();

        //Create new Encounter object
        Encounter encounter = new Encounter();
        encounter.setPatient(patient);
        encounter.setVitalSign(vitalSigns);

        
        System.out.println("If you want to enter age in months please enter M else enter Y");
        String monthOrYear = scanner.next();

        if (monthOrYear.equalsIgnoreCase("Y")) {
            System.out.println("Enter the age");
            patient.setAge(scanner.nextDouble());
        } else {
            System.out.println("Enter the age in months");
            double age = scanner.nextDouble() / 12;
            patient.setAge(age);
        }
        
        System.out.println("Please enter current Respiratory rate");
        vitalSigns.setResporatoryRate(scanner.nextInt());

        System.out.println("Please enter current Heart rate");
        vitalSigns.setHeartRate(scanner.nextInt());

        System.out.println("Please enter current Systolic Blood Pressure");
        vitalSigns.setBloodPressure(scanner.nextInt());

        System.out.println("Please enter current weight in KG");
        vitalSigns.setWeight(scanner.nextDouble());
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        encounter.setTimestamp(timestamp.toString());
        
        // Adding Vital sign to patients history
        patient.getEncounterHistory().addEncounter(encounter);
        System.out.println("-----------Vital signs has been added sucessfully----------");
    }
   
}
