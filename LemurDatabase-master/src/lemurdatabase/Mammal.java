/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import javax.swing.JOptionPane;

/**
 *
 * @author kyluk1259
 */
public abstract class Mammal {
  
  private int itsAge, j;
  private double itsWeight;
  private String itsBreed, itsLocation, itsGender, itsClassification, itsCoat, itsInfo, itsColour, itsPack;
  private TreeLemur treeLemur;
  private DesertLemur desertLemur;
  private JungleLemur jungleLemur;

  public int setAge(int newAge) {
      itsAge = newAge;
      return itsAge;
    }

    public double setWeight(double newWeight) {
        itsWeight = newWeight;
        return itsWeight;
    }

    public String setBreed() {
        
        try{
        String k = JOptionPane.showInputDialog("What breed lemur?");
        if(k == null){
            System.exit(0);
        }else{
            j = Integer.parseInt(k);
        }
        }catch(NumberFormatException e){
            setBreed();
        }
        
        if(j == 1){
            itsBreed = "Tree Lemur";
            treeLemur = new TreeLemur();
        }else if(j == 2){
            itsBreed = "Desert Lemur";
            desertLemur = new DesertLemur();
        }else if(j == 3){
            itsBreed = "Jungle Lemur";
            jungleLemur = new JungleLemur();
        }
        
        return itsBreed;
    }

    public String getClassification() {

        itsClassification = "Prosimian";
        return itsClassification;
    }

    public String getLocation() {
        itsLocation = "Madagascar";
        
        return itsLocation;
    }

    public String getCoat() {
        itsCoat = "Fur";
        return itsCoat;
    }

    public String setGender(int random) {
        
        if(random == 1){
            itsGender = "Male";
        }else{
            itsGender = "Female";
        }
        
        return itsGender;
    }
    
    public String getBreedInfo(String breed){
        
        if(breed.equals("Tree Lemur")){
            itsInfo = treeLemur.toString();
        }else if(breed.equals("Desert Lemur")){
            itsInfo = desertLemur.toString();
        }else if(breed.equals("Jungle Lemur")){
            itsInfo = jungleLemur.toString();
        }
        
        return itsInfo;
    }
}
