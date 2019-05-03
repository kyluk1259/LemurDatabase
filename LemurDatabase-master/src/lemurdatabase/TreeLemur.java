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
public class TreeLemur {
    
    private String food, pack, mane;
    
    public TreeLemur(){
        food = "Fruit";
        pack = "Large Groups";
        mane = "Red";
    }
    
    @Override
    public String toString(){       
        String output = "\nFood: " + food;
        output += "\nPack: " + pack;
        output += "\nColour: " + mane;
        
        return output;
    }
    
}
