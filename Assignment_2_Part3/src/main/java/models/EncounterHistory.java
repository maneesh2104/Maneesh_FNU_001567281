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
public class EncounterHistory {
    
    ArrayList<Encounter> encounterList;
    
    public EncounterHistory(){
        encounterList = new ArrayList<>();
    }
    
    public void addEncounter(Encounter encounter){
        this.encounterList.add(encounter);
    }
    
    
}
