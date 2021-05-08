package com.company.TaskA;

public class HardDriveSSD {
    private int memoryCapacity;
    private int disksDivided;
    public HardDriveSSD (int memoryCapacity, int disksDivided){
        this.memoryCapacity = memoryCapacity;
        this.disksDivided = disksDivided;
    }
    public HardDriveSSD () {
        memoryCapacity = 1;
        disksDivided = 3;
    }

    @Override
    public String toString() {
        return "memoryCapacity = " + memoryCapacity +
                ", disksDivided = " + disksDivided;
    }
}
