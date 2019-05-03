/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kyluk1259
 */
public class LemurDatabase {
    /**
     * @param args the command line arguments
     */
    
    private static ArrayList<Lemur> lemurs = new ArrayList();
    private static String output;
    
    public static void main(String[] args) {
        // TODO code application logic here    
        setLemurs();
    }
    
    //Set amount of lemurs for the array list
    public static void setLemurs(){
        String k = JOptionPane.showInputDialog("How many lemurs?");
        check(k);
    }
    
    //Check input
    public static void check(String in){
        if(in == null){
            System.exit(0);
        }else if(isWhiteSpace(in)){
            setLemurs();
        }else{
            try{
            int lemurCount = Integer.parseInt(in);
            getLemurs(lemurCount);
            }catch(NumberFormatException e){
                setLemurs();
            }
        } 
    }
    
    //Check for proper inputs
    public static boolean isWhiteSpace(String in){
        for(char a : in.toCharArray()){
            if(Character.isWhitespace(a) || Character.isAlphabetic(a)){
                return true;
            }
        }
        return false;
    }
    
    //Add new lemurs to array list
    public static void getLemurs(int lemurC){
        for(int i = 0; i < lemurC; i++){
            lemurs.add(new Lemur());
        }
        String print = printLemurs(lemurC);
        System.out.println(print);
        
    }
   
    //Add Lemurs to string 
    public static String printLemurs(int lemurC){
        output = "";
        for(int i = 0; i < lemurC; i++){
            output += lemurs.get(i).toString();
            output += "\n__________________________\n";
        }
        return output;
    }
}
