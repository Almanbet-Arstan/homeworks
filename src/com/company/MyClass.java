package com.company;

public class MyClass {
    private String name1;
    private String name2;

    public MyClass(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public synchronized void ShowNames(String name){
        System.out.println(name);
    }
}
