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
    ArrayList<VitalSigns> history;
    
    public VitalSignsHistory(){
        history = new ArrayList<>();
    }
    
    public VitalSigns addNewVitalList(){
         VitalSigns newSign = new VitalSigns();
         history.add(newSign);
         return newSign;
    }
    
    public VitalSigns addNewVitalList(VitalSigns sign){
         history.add(sign);
         return sign;
    }
    
    
    
    
    
    
    
    
}
