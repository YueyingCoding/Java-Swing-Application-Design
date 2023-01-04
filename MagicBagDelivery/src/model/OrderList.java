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
public class OrderList {
    
    private ArrayList<order> history;
    
    public OrderList(){
        this.history = new ArrayList<order>();
    }

    public ArrayList<order> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<order> history) {
        this.history = history;
    }
    
    public order addNewOrder(){
        
        order newOrder= new order();
        history.add(newOrder);
        return newOrder;
    }
    public void deleteOrder(order Order){
        history.remove(Order);
    }
}
