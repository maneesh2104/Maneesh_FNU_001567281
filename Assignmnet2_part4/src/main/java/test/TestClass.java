/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import models.City;
import models.CityList;
import models.Community;
import models.Encounter;
import models.EncounterHistory;
import models.House;
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
        CityList cityList = new CityList();
        

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
                    addVitalSign(scanner, patientList, cityList);
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
                case 5:
                    checkCommunityBP(scanner, cityList);
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
        System.out.println("\t 5 - Check BP in community");
        
    }
    
    private static void addVitalSign(Scanner scanner, PatientList patientList, CityList cityList) {
        //Function to add vital sign
        System.out.println("-----------Patient Details-----------");
        System.out.println("Please enter patient name");
        String patientName = scanner.next();
        
        //user input city name
        System.out.println("Enter the city name");
        String city = scanner.next();
        
        //Getting city object
        City cityObj = cityList.getCity(city);
        
        //user input community name
        System.out.println("Enter the community name");
        String comunityName = scanner.next();
        
        //Getting community object
        Community community = cityObj.getCommunity(comunityName);
        
        //user input house number
        System.out.println("Enter house number");
        int houseNumber = scanner.nextInt();
        
        House houseObj = community.getHouse(houseNumber);
        Patient patient = patientList.getPatient(patientName, false);
        patient.setHouse(houseObj);
        patient.setCommunity(community);
        patient.setCity(cityObj);

        houseObj.getPersonList().add(patient);
        
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
            double age = scanner.nextDouble();
            vitalSigns.setAge(age);
            patient.setAge(age);
        } else {
            System.out.println("Enter the age in months");
            double age = scanner.nextDouble() / 12;
            patient.setAge(age);
            vitalSigns.setAge(age);
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

    private static void checkCommunityBP(Scanner scanner, CityList cityList) {
        
        System.out.println("Please enter the city name");
        String cityName = scanner.next();
        
        City city = cityList.getCity(cityName);
        
        System.out.println("Enter the community name");
        String comunityName = scanner.next();
        Community community = city.getCommunity(comunityName);
        
        //Iterate through the commiunity and add 
        ArrayList<House> houseList = community.getHouseList();
        int count = 0;
        for(House home: houseList){
            ArrayList<Patient> patientList = home.getPersonList();
            for(Patient patient: patientList){
                EncounterHistory encounterHistiory = patient.getEncounterHistory();
                
                for (Encounter encounter: encounterHistiory.encounterList){
                    VitalSigns vs = encounter.getVitalSign();
                     if (!(vs.isBloodPressureNormal())){
                         count ++;
                         System.out.println("Patient "  + patient.getName() +
                                 " blood pressure is not normal");
                     }                    
                }
                
            }
        }
        
        System.out.println("#####################Count of people with abnormal blood pressure in "
                + comunityName + " is: " + count + " #####################");

    }
   
}
