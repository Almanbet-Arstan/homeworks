package com.company.Homework;

import java.util.Objects;

public class Town implements Comparable{
    private int id;
    private String name;

    public Town(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Town() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Town name is %s id = %d", getName(), getId());
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(id, ((Town)o).id);
    }

}
