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
public class Feedbacks {
    
    private ArrayList<Feedback> history;
    
    public Feedbacks(){
        this.history = new ArrayList<Feedback>();
    }

    public ArrayList<Feedback> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Feedback> history) {
        this.history = history;
    }
    
    public Feedback addNewFeedback(){
        
        Feedback newFeedback = new Feedback();
        history.add(newFeedback);
        return newFeedback;
    }
    public void deleteFeedback(Feedback fb){
        history.remove(fb);
    }
}
