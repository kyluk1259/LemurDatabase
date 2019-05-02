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
    
    public Lemur() {
       String breed = super.setBreed();
       int age = super.setAge(rand.nextInt((10-1)+1)+1);
       double weight = super.setWeight(rand.nextDouble() + 1.5);
       String gender = super.setGender(rand.nextInt((1-0)+0)+0);
       String location = super.getLocation();
       String classification = super.getClassification();
       String coat = super.getCoat();
       if(gender.equals("Female")){
           String role = "Female Lemur = Dominant Role";
       }
       String food = super.getFood(breed);
       
    }

    
}
