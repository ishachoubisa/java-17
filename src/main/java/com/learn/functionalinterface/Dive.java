package com.learn.functionalinterface;

//It is a functional interface only one abstract method dive others are Object methods
@FunctionalInterface
public interface Dive {
    abstract String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();
}
