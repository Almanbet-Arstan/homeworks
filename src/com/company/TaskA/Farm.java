package com.company.TaskA;

import java.util.Arrays;

public class Farm {
    private String farmAddress;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;
    private String fullNameOfFarmOwner;

    public Farm(String farmAddress, Cow[] cows, Sheep[] sheeps, Horse[] horses, String fullNameOfFarmOwner) {
        this.farmAddress = farmAddress;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.fullNameOfFarmOwner = fullNameOfFarmOwner;
    }


    @Override
    public String toString() {
        return "Farm{" +
                "\nfarmAddress = '" + farmAddress + '\'' +
                ",\ncows = " + Arrays.toString(cows) +
                ",\nsheeps = " + Arrays.toString(sheeps) +
                ",\nhorses = " + Arrays.toString(horses) +
                ",\nfullNameOfFarmOwner = '" + fullNameOfFarmOwner + '\'' +
                '}';
    }
}
