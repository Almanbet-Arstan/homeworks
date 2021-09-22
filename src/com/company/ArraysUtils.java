package com.company;

public class ArraysUtils {
    public static <T> T getFirstElement(T[] array){
        return array[0];
    }
    public static <T> T getLastElement(T[] array){
        return array[array.length - 1];
    }
}
