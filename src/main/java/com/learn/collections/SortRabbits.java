package com.learn.collections;

import java.util.*;

public class SortRabbits {
    static record Rabbit(int id){}

    public static void main(String[] args) {
        List<Rabbit> rabbit = new ArrayList<>();
        rabbit.add(new Rabbit(3));
        rabbit.add(new Rabbit(1));
        //Collections.sort(rabbit);

        //Using comparator to sort
        Comparator<Rabbit> c= (r1,r2)-> r1.id-r2.id;
        Collections.sort(rabbit,c);
        System.out.println(rabbit);

        //sorting in reverse order
        Collections.sort(rabbit,c);
        Collections.reverse(rabbit);
        System.out.println(rabbit);

        //Binary search
        List<Integer> list = Arrays.asList(6,9,1,8);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,6));
        System.out.println(Collections.binarySearch(list,3));


        var name = Arrays.asList("Fluffy","Hoppy");
        Comparator<String> c1 = Comparator.reverseOrder();
        var index = Collections.binarySearch(name,"Hoppy",c1);
        System.out.println(index);
    }
}
