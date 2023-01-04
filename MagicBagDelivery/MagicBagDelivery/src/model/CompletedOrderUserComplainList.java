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
public class CompletedOrderUserComplainList {
    
    private ArrayList<CompletedOrderUserComplain> history;
    
    public CompletedOrderUserComplainList(){
        this.history = new ArrayList<CompletedOrderUserComplain>();
    }

    public ArrayList<CompletedOrderUserComplain> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CompletedOrderUserComplain> history) {
        this.history = history;
    }
    
    public CompletedOrderUserComplain addNewCOUC(){
        
        CompletedOrderUserComplain newCOUC= new CompletedOrderUserComplain();
        history.add(newCOUC);
        return newCOUC;
    }
    public void deleteCOUC(CompletedOrderUserComplain couc){
        history.remove(couc);
    }
}
