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

        System.out.println("Hi welcome to Part 2");
        System.out.println("For addding new vital signs please press 1 for viewing history please press 2 \n Enter 3 to check vital signs \n Press 4 to exit");

        Scanner scanner = new Scanner(System.in);
        int userChoice = 1;

        while (userChoice != 3) {
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Please neter patient name for whom you want the view history of");
                    String patientNameGet = scanner.next();
                    Patient patientGet = patientList.getPatient(patientNameGet);
                    patientGet.displayHistory();
                    System.out.println("For addding new vital signs please press 1 for viewing history please press 2 \n Enter 3 to exit \n");
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
                    System.out.println("For addding new vital signs please press 1 for viewing history please press 2 \n Enter 3 to exit \n");
                    break;
                case 3:
                    System.out.println("----------Checking Vitals signs for patient----------");
                    
                    
                    }
            }
        }
}
