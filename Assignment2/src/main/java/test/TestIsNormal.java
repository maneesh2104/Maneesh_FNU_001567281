/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import models.Patient;
import models.VitalSigns;

/**
 *
 * @author maneesh
 */
public class TestIsNormal {

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter patient name");

            Patient patient = new Patient();
            patient.setName(scanner.nextLine());

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

            boolean result = patient.isPatientNormal(vitalSigns);
            if (result == true) {
                System.out.println("Patient is normal");
            } else {
                System.out.println("Patient is not normal");
            }
            
            System.out.println("Please enter Y if you want to continue");
            String isContinue = scanner.next();
            
            if (!isContinue.equalsIgnoreCase("y")){
                flag = false;
            }

            

        }

    }
}
