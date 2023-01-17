package com.learn.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapMethods {
    public static void main(String[] args) {

        //Using HashMap
        Map<String,String> map = new HashMap<>();
        map.put("Lion","meat");
        map.put("Giraffe","leaf");
        map.put("Panda","bamboo");
        String food = map.get("Panda");
        System.out.println(food);
        for(String key : map.keySet()){
            System.out.println(key);
        }

        //Using TreeMap
        Map<String,String> map1 = new TreeMap<>();
        map1.put("lion","meat");
        map1.put("giraffe","leaf");
        map1.put("panda","bamboo");
        String food1 = map.get("panda");
        System.out.println(food1);
        for(String key : map1.keySet()){
            System.out.println(key);
        }

        //System.out.println(map.contains("Lion"));//Does not compile,contains is not method of map it is a method of collections
        System.out.println(map.containsKey("Lion"));//true
        System.out.println(map.containsValue("Lion"));//false
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());

         //Iterating through Map
        Map<Integer,Character> map3 = new HashMap<>();
        map3.put(1,'a');
        map3.put(2,'b');
        map3.put(3,'c');
        map3.forEach((k,v) -> System.out.println(v));

        //Map has value() method to get values
        map3.values().forEach(System.out::println);
        //Map has keySet() method to get all keys
        map3.keySet().forEach(System.out::println);

        //Java has a static interface inside Map called Entry. It provides methods to get key and value of each pair
       map3.entrySet().forEach(e -> System.out.println(e.getKey() + " " +e.getValue()));

       //Getting values safely
        Map<Character,String> map4 = new HashMap<>();
        map4.put('x',"spot");
        System.out.println("X marks the "+map4.get('x'));
        System.out.println("X marks the "+map4.getOrDefault('x',""));
        System.out.println("X marks the "+map4.get('y'));
        System.out.println("X marks the "+map4.getOrDefault('y',""));

        //Replacing values
        Map<Integer,Integer> map5 = new HashMap<>();
        map5.put(1,2);
        map5.put(2,4);
        System.out.println(map5.replace(2,10));
        map5.replaceAll((k,v) -> k + v);
        System.out.println(map5);

        //Putting if absent
        Map<String,String> favourites = new HashMap<>();
        favourites.put("Sam","bus tour");
        favourites.put("Joe",null);
        favourites.putIfAbsent("Sam","Tram");
        favourites.putIfAbsent("Joe","Tram");
        favourites.putIfAbsent("Rachel","Tram");
        System.out.println(favourites);//This method does not update the value if one was already present,it update only when
                                       //null or no other value is present

        //Merging
        BiFunction<String,String,String> mapper = (v1,v2) -> v1.length()>v2.length()?v1:v2;
        Map<String,String> favourites2 = new HashMap<>();
        favourites2.put("Jenny","Bus Tour");
        favourites2.put("Tom","Tram");
        String jenny = favourites2.merge("Jenny","Skyride",mapper);
        String tom = favourites2.merge("Tom","Skyride",mapper);
        System.out.println(favourites2);
        System.out.println(jenny);
        System.out.println(tom);

        //when missing keys or null value are involved,it does not call BiFunction al all. It simply uses new value
        Map<String,String> favorites = new HashMap<>();
        favorites.put("Sam",null);
        favorites.merge("Tom","Skyride",mapper);
        favorites.merge("Sam","Skyride",mapper);
        System.out.println(favorites);

        //when mapping function is called and returns null,key is removed from map
        BiFunction<String,String,String> mapper2 = (v1,v2)->null;
        Map<String,String> favorites2 = new HashMap<>();
        favorites2.put("Jenny","Bus Tour");
        favorites2.put("Tom","Bus Tour");

        favorites2.merge("Jenny","Skyride",mapper2);
        favorites2.merge("Sam","Skyride",mapper2);
        System.out.println(favorites2);

    }
}
