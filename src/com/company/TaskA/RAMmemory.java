package com.company.TaskA;

public class RAMmemory {
    private int volume;
    private String manufacturer;
    public RAMmemory(int volume, String manufacturer){
        this.volume = volume;
        this.manufacturer = manufacturer;
    }
    public RAMmemory() {
        volume = 8;
        manufacturer = "China";
    }

    @Override
    public String toString() {
        return "volume = " + volume +
                ", manufacturer = '" + manufacturer + '\'';
    }
}
