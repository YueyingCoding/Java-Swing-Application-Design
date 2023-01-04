/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chengzhishi
 */
public class CurrentOrderUserComplainList {
    
    private ArrayList<CurrentOrderUserComplain> history;
    
    public CurrentOrderUserComplainList(){
        this.history = new ArrayList<CurrentOrderUserComplain>();
    }

    public ArrayList<CurrentOrderUserComplain> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CurrentOrderUserComplain> history) {
        this.history = history;
    }
    
    public CurrentOrderUserComplain addNewCOUC(){
        
        CurrentOrderUserComplain newCOUC= new CurrentOrderUserComplain();
        history.add(newCOUC);
        return newCOUC;
    }
    public void deleteCOUC(CurrentOrderUserComplain couc){
        history.remove(couc);
    }
}
