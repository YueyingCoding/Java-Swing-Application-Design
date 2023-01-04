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
public class customers {
    private ArrayList<customer> history;
    
    public customers(){
        this.history = new ArrayList<customer>();
    }

    public ArrayList<customer> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<customer> history) {
        this.history = history;
    }
    
    public customer addNewCustomer(){
        
        customer newCustomer= new customer();
        history.add(newCustomer);
        return newCustomer;
    }
    public void deleteCustomer(customer Customer){
        history.remove(Customer);
    }
    
}
