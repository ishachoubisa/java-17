package com.learn.collections;

public class SizeLimitedCrater<T,U> {
    private T contents;
    private U sizeLimited;
    public SizeLimitedCrater(T contents,U sizeLimited){
        this.contents = contents;
        this.sizeLimited = sizeLimited;
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Integer numPound = 15_000;
        SizeLimitedCrater<Elephant,Integer> c1 = new SizeLimitedCrater<>(elephant,numPound);

    }
}
