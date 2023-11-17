package org.yu.farm;

public interface LifeForm {
    default void eatUnderYonderTree() {
        System.out.println("Check");
    }
}
