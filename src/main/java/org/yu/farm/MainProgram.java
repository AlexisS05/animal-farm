package org.yu.farm;

import org.yu.farm.scary.ScaryAnimal;

import java.util.List;

/*
 * LET'S TAKE A TRIP TO A FARM AND MEET SOME ANIMALS!
 *
 */

public class MainProgram {
    public static void main(String[] args) {
        AnimalFarm myFarm = new AnimalFarm();


        List<Animal> animalList = myFarm.getAnimals();


        // Let's meet each of the animals!

        for (Animal a : animalList) {

            System.out.println("Person: Oooh!  An animal!  Tell me about yourself!");
            System.out.printf("Animal: Hello, I'm %s the %s \n", a.getName(), a.getSpecies());

            // add a POLYMORPHIC call to makeNoise();
            a.makeNoise();
            // add a POLYMORPHIC call to eatUnderYonderTree();
            a.eatUnderYonderTree();

            if ( a instanceof ScaryAnimal)
                System.out.println("EEEEEK. A SCARY ANIMAL");

            if(a instanceof Pettable)
                ((Pettable)a).pet();

            System.out.println("");

        }

    }
}
