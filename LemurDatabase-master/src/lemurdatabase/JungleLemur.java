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
public class JungleLemur {
    
     private String food, pack, mane, colour;
    
    public JungleLemur(){
        food = "Mice, Insects, and Snails";
        pack = "Small Groups";
        colour = "Black or Blue";
        mane = "No Mane";
    }
    
    @Override
    public String toString(){       
        String output = "\nFood: " + food;
        output += "\nPack: " + pack;
        output += "\nColour: " + colour;
        output += "\nMane: " + mane;
        
        return output;
    }
}
