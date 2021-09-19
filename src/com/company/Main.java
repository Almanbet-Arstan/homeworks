package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OldGeneric stringGeneric = new OldGeneric("Hello");
        OldGeneric integerGeneric = new OldGeneric(50);
        MyGeneric<Integer> myGeneric1 = new MyGeneric<>();
        myGeneric1.setValue(2);
        MyGeneric<String> myGeneric2 = new MyGeneric<>();
        myGeneric2.setValue("Hello");
        System.out.println(myGeneric1.getValue());
        System.out.println(myGeneric2.getValue());
    }
}
