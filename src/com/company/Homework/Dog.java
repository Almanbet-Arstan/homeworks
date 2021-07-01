package com.company.Homework;

public class Dog {
    private String name;
    private int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public boolean equals(Object o) {
        if(this.hashCode() == o.hashCode()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.weight + name.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Меня зовут %s, я вешу %d килограмм", name, weight);
    }
}
