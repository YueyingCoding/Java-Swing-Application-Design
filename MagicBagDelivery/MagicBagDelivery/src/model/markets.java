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
public class markets {
    private ArrayList<Market> history;
    
    public markets(){
        this.history = new ArrayList<Market>();
    }

    public ArrayList<Market> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Market> history) {
        this.history = history;
    }
    
    public Market addNewMarket(){
        
        Market newMarket= new Market();
        history.add(newMarket);
        return newMarket;
    }
    public void deleteMarket(Market mkt){
        history.remove(mkt);
    }
    
}
