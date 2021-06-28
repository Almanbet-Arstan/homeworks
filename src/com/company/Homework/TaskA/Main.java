package com.company.Homework.TaskA;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> compAndLap = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            compAndLap.add(new Laptop(30000, Models.DELL, true));
            compAndLap.add(new Computer(60000, Models.LG, 16, false));
        }
        for (int k = 0; k < 25; k++) {
            compAndLap.add(new Laptop(50000, Models.LENOVO, true));
            compAndLap.add(new Computer(100000, Models.MAC, 18, false));
        }
        int allSum = 0;
        for (Object item:compAndLap) {
            if (item instanceof Computer){
                allSum += ((Computer) item).getPrice();
            }
            if (item instanceof Laptop && ((Laptop) item).isSales()){
                allSum += (((Laptop) item).getPrice() / 100) * 80;
            }
        }
        System.out.println(allSum);
        findTheLaptop(compAndLap, new Laptop(30000, Models.LENOVO, true));
        findTheComputer(compAndLap, new Computer(100000, Models.LG, 18, false));

        for (int l = 0; l < compAndLap.size(); l++) {
            if (compAndLap.get(l) instanceof Laptop){
                if (((Laptop) compAndLap.get(l)).getModel() == Models.DELL || ((Laptop) compAndLap.get(l)).getModel() == Models.LENOVO){
                    compAndLap.removeAll(compAndLap);
                }
            }
        }
        for (int m = 0; m < compAndLap.size(); m++) {
            if (compAndLap.get(m) instanceof Computer){
                if ((((Computer) compAndLap.get(m)).getModel()) == Models.LG || (((Computer) compAndLap.get(m)).getModel()) == Models.MAC){
                    compAndLap.removeAll(compAndLap);
                }
            }
        }
        System.out.println(compAndLap);
        ArrayList<Object> newCompAndLap = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            newCompAndLap.add(new Laptop(30000, Models.DELL, true));
            newCompAndLap.add(new Computer(60000, Models.LG, 16, false));
            newCompAndLap.add(new Laptop(50000, Models.LENOVO, true));
            newCompAndLap.add(new Computer(100000, Models.MAC, 18, false));
        }
        System.out.println(newCompAndLap);
        ArrayList<Object> SortedList = new ArrayList<>();
        toSortByPrice(newCompAndLap, SortedList);
    }

    public static void toSortByPrice(ArrayList arrayList, ArrayList arrayList2) {
        int theBiggest = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Laptop){
                if (((Laptop) arrayList.get(i)).getPrice() > theBiggest){
                    theBiggest = ((Laptop) arrayList.get(i)).getPrice();
                    arrayList2.add(0, arrayList.get(i));
                }else {
                    arrayList2.add(arrayList2.size()-1, arrayList.get(i));
                }
            }
            if (arrayList.get(i) instanceof Computer){
                if (((Computer) arrayList.get(i)).getPrice() > theBiggest){
                    theBiggest = ((Computer) arrayList.get(i)).getPrice();
                    arrayList2.add(0, arrayList.get(i));
                }else {
                    arrayList2.add(arrayList2.size()-1, arrayList.get(i));
                }
            }
        }
        System.out.println(arrayList2);
    }

    public static void findTheLaptop(ArrayList arrayList, Laptop laptop){
        if (arrayList.contains(laptop)){
            if (laptop.isSales()){
                laptop.setPrice((laptop.getPrice() / 100) * 80);
                System.out.println(laptop.toString());
            }else {
                System.out.println(laptop.toString());
            }
        }else {
            System.out.println("No such laptop");
        }
    }
    public static void findTheComputer(ArrayList arrayList, Computer computer){
        if (arrayList.contains(computer)){
            if (computer.isSales()){
                computer.setPrice((computer.getPrice() / 100) * 80);
                System.out.println(computer.toString());
            }else {
                System.out.println(computer.toString());
            }
        }else {
            System.out.println("No such computer");
        }
    }

}
