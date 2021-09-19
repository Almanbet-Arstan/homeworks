package com.company;

public class OldGeneric {
    private Object value;

    public Object getValue() {
        return value;
    }

    public OldGeneric(Object value) {
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    public void add(Object value){
        this.value = value;
    }
}
