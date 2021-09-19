package com.company.Homework;

public class Generic<F, S> {
    private F first;
    private S second;

    public Generic(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public String getInfoFirst(){
        return "Class name = " + first.getClass() + ", hashcode = " + first.hashCode();
    }

    public String getInfoSecond(){
        return "Class name = " + second.getClass() + ", hashcode = " + second.hashCode();
    }

    public boolean check() {
        return first.getClass().equals(second.getClass())
                && first.hashCode() == second.hashCode();
    }
}
