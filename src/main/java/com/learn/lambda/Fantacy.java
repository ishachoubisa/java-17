package com.learn.lambda;

import java.util.function.Predicate;

public class Fantacy {
    public static void scary(String animal){
        //var dino = s ->"dino".equals(animal);// DOES NOT COMPILE cannot resolve type of var
        //var dragon = s -> "dragon".equals(animal);//DOES NOT COMPILE cannot resolve type of var
       // var combined = dino.or(dragon);
        //System.out.println(combined.test(animal));
    }

    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
    }
}
