/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author kyluk1259
 */
public class DesertLemur {
    
    private String food, babies, mane;
    
    public DesertLemur(){
        food = "Cacti";
        babies = "66%";
        mane = "White";
    }
    
    @Override
    public String toString(){       
        String output = "\nFood: " + food;
        output += "\nInfant Mortality: " + babies;
        output += "\nColour: " + mane;
        
        return output;
    }
    
}
