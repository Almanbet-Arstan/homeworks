package com.company;

public class MyGeneric<T> {
    private T value;

    public MyGeneric(T value) {
        this.value = value;
    }
    public MyGeneric(){

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
