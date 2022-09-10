package com.learn.functionalinterface;

//@FunctionalInterface
//It is not a functional interface it contains two abstract method equals method in case is not a Object class method it is an abstract method
public interface Hibernate {
    String toString();
    public boolean equals(Hibernate o);
    abstract int hashCode();
    public void rest();
}
