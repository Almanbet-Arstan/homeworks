package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3};
        Boolean[] booleans = {true, false, false};
        System.out.println("First: " + ArraysUtils.getFirstElement(Arrays.asList(1,2,3).toArray()));
        System.out.println("Last: " + ArraysUtils.getLastElement(integers));

        System.out.println("First: " + ArraysUtils.getFirstElement(booleans));
        System.out.println("Last: " + ArraysUtils.getLastElement(booleans));
    }
}
