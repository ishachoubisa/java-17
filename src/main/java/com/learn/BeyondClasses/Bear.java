package com.learn.BeyondClasses;

public class Bear implements Herbivore,Omnivore{//Compatible,method can be written that properly overrides both
    //inherited methods for eg. by using covariant return type.
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
