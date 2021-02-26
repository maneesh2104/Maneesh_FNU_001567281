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
public class City {
    private ArrayList<Community> communityList;
    private String name;
    
    public City(){
        communityList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community getCommunity(String name){
        //Checking if community already exists
        for(Community community:communityList){
            if(community.getName().equalsIgnoreCase(name)){
                return community;
            }
        }
        //if no commnity exists
        Community newCommunity = new Community();
        newCommunity.setName(name);
        communityList.add(newCommunity);
        return newCommunity;
    }
    
}
