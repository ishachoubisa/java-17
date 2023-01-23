package com.learn.collections;

import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit{int id;}

    public static void main(String[] args) {
        Set<Duck> duck = new TreeSet<>();
        duck.add(new Duck("Puddles"));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit());

        //Using comparator
        Set<Rabbit> rabbits1 = new TreeSet<>((r1,r2)->r1.id- r2.id);
        rabbits1.add(new Rabbit());

    }

}
