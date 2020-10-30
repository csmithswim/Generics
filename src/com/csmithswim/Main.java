package com.csmithswim;

import com.csmithswim.generics.GenericList;

public class Main {
//Any primitive types must be stored as a wrapper class within generics.
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<>();
        //You can pass an instance of the integer class or a primitive integer.
        //The java compiler will automatically wrap the integer within the integer class, known as boxing.
        numbers.add(1); //Boxing
        int number = numbers.get(0); //Unboxing
    }
}
