/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;
import models.Patient;
import models.PatientList;
import models.VitalSigns;

/**
 *
 * @author maneesh
 */
public class MainTestClass {

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
                    System.out.println("Please enter patient name for whom you want the view history of");
                    String patientNameGet = scanner.next();
                    Patient patientGet = patientList.getPatient(patientNameGet);
                    patientGet.displayHistory();
                    displayInputMessages();
                    break;

                case 2:
                    System.out.println("-----------Patient Details-----------");
                    System.out.println("Please enter patient name");
                    String patientName = scanner.next();
                    Patient patient = patientList.getPatient(patientName);
                    System.out.println("-----------Vital Sign Details-----------");
                    System.out.println("Please enter vital signs");

                    VitalSigns vitalSigns = new VitalSigns();
                    System.out.println("Please enter current Respiratory rate");
                    vitalSigns.setResporatoryRate(scanner.nextInt());

                    System.out.println("Please enter current Heart rate");
                    vitalSigns.setHeartRate(scanner.nextInt());

                    System.out.println("Please enter current Systolic Blood Pressure");
                    vitalSigns.setBloodPressure(scanner.nextInt());

                    System.out.println("Please enter current weight in KG");
                    vitalSigns.setWeight(scanner.nextDouble());

                    System.out.println("If you want to enter age in months please enter M else enter Y");
                    String monthOrYear = scanner.next();

                    if (monthOrYear.equalsIgnoreCase("Y")) {
                        System.out.println("Enter the age");
                        vitalSigns.setAge(scanner.nextDouble());
                    } else {
                        System.out.println("Enter the age in months");
                        double age = scanner.nextDouble() / 12;
                        vitalSigns.setAge(age);
                    }

                    // Adding Vital sign to patients history
                    patient.addVitalSign(vitalSigns);
                    System.out.println("-----------Vital signs has been added sucessfully----------");
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
        System.out.println("----------Checking Vitals signs for patient----------");
        
        //Get patient name
        System.out.println("Enter patient name");
        String patientName = scanner.next();
        Patient patient = patientList.getPatient(patientName);
        
        System.out.println("Hi " + patientName.toUpperCase() + " welcome to the checking portal");
        
        System.out.println("Please enter the vital sign you want to check: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"Weight\"");
        VitalSigns latestSign = patient.getLatestVitalSign();

        
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
}
