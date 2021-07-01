package com.company.Lesson;

public class Multiple {
    private Integer a;
    private Integer b;

    public Multiple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Multiple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject){
            return true;
        }
        if (this instanceof Multiple){
            Multiple otherMultiple = (Multiple) otherObject;
            if ((this.a * this.b) == otherMultiple.a * otherMultiple.b){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
