package com.learn.collections;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        var other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);//you might be sorting Product objects by name,but names are not unique.
                                             //the compareTo() method does not have to be consistent with equals.
                                             //to fix this we use comparator to define sort elsewhere.
    }
}