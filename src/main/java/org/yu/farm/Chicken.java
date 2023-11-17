package org.yu.farm;

public class Chicken extends Animal{

    protected Chicken( String name) {
        super(AnimalType.CHICKEN, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cluck cluck");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Chicken is eating under the tree");
    }
}
