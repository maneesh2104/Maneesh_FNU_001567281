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
public class VitalSignsHistory {
    private ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
        history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns sign = new VitalSigns();
        history.add(sign);
        
        return sign;
    }
    
    public void deleteVitalSigns(VitalSigns vs){
        history.remove(vs);
    }
}
