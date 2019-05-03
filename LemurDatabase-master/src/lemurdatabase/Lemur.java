/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemurdatabase;

import java.util.Random;

/**
 *
 * @author kyluk1259
 */
public class Lemur extends Mammal {

    private Random rand = new Random();
    private String breed, gender, location, classification, coat, breedInfo, role;
    private int age;
    private double weight;
    
    public Lemur() {
       breed = super.setBreed();
       age = super.setAge(rand.nextInt((10-1)+1)+1);
       weight = super.setWeight(rand.nextDouble() + 1.5);
       gender = super.setGender(rand.nextInt((2-1)+1));
       location = super.getLocation();
       classification = super.getClassification();
       coat = super.getCoat();
       if(gender.equals("Female")){
            role = "Female Lemur = Dominant Role";
       }
       breedInfo = super.getBreedInfo(breed);
       
    }
    
    //Send lemur information to String
    public String toString(){
        String output = breed + ":";
        output += "\nAge: " + age;
        output += "\nWeight: " + weight;
        output += "\nGender: " + gender;
        output += "\nLocation: " + location;
        output += "\nClassification: " + classification;
        output += "\nCoat: " + coat;
        if(gender.equals("Female")){
            output += "\nRole: " + role;
       }
        output += breedInfo;
        return output;
    }

    
}
