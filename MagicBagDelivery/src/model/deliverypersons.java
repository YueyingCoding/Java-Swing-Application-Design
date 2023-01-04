/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author evelyn
 */
public class deliverypersons {
     private ArrayList<deliveryperson> history;
    
    public deliverypersons(){
        this.history = new ArrayList<deliveryperson>();
    }

    public ArrayList<deliveryperson> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<deliveryperson> history) {
        this.history = history;
    }
    
    public deliveryperson addNewdeliveryperson(){
        
        deliveryperson newdeliveryperson= new deliveryperson();
        history.add(newdeliveryperson);
        return newdeliveryperson;
    }
    public void deletedeliveryperson(deliveryperson dp){
        history.remove(dp);
    }
    
}
