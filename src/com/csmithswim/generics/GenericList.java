package com.csmithswim.generics;

public class GenericList <T extends Number>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}

//Implementing a restriction: extending this GenericList class to only accept primitive types of numbers
//Java has a popular interface called Comparable that compares classes based on some criteria.
//Cloneable is another popular interface that clones a class
//T parameter is now bounded and restricted.

//public class GenericList <T extends  Comparable & Cloneable>{
//    private T[] items = (T[]) new Object[10];
//    private int count;
//
//    public void add(T item) {
//        items[count++] = item;
//    }
//
//    public T get(int index) {
//        return items[index];
//    }
//}

//Use T for type or template, or E for element for a class that acts as a collection within <>
//It is a type parameter, it represents the types of objects we want to store in this class.
//T represents the type of object we want to store, i.e. User, Integer, String, etc.

//public class GenericList <T extends Number>{
//    private T[] items = (T[]) new Object[10];
//    private int count;
//
//    public void add(T item) {
//        items[count++] = item;
//    }
//
//    public T get(int index) {
//        return items[index];
//    }
//}
