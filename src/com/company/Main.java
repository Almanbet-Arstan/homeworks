package com.company;

public class Main {
    public static void main(String[] args) {
        Comparable[] firefighters = new Firefighter[2];
        Comparable[] businessmen = new Businessman[2];
        Comparable[] pensioners = new Pensioner[2];
        firefighters[0] = new Firefighter("Aziret", 34, 40000, 10);
        firefighters[1] = new Firefighter("Astan", 26, 10000, 2);
        businessmen[0] = new Businessman("Maksat", 23, 16000, 5);
        businessmen[1] = new Businessman("Shamil", 65, 300000, 35);
        pensioners[0] = new Pensioner("Atai", 60, 15000, 38);
        pensioners[1] = new Pensioner("Ulan", 70, 20000, 40);
        Comparable busi = new Businessman("la", 1335, 5431, 16);

        System.out.println(sort(businessmen, false));
        System.out.println(sort(pensioners, false));
        System.out.println(sort(firefighters, true));
    }
    public static Comparable[] sort(Comparable[] comparables, boolean isAsc){
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i; j < comparables.length; j++) {
                if (isAsc){
                    if (comparables[i].compareTo(comparables[j]) < 0){
                        Comparable comparable = comparables[i];
                        comparables[i] = comparables[j];
                        comparables[j] = comparable;
                    }
                } else {
                    if (comparables[i].compareTo(comparables[j]) > 0){
                        Comparable comparable = comparables[i];
                        comparables[i] = comparables[j];
                        comparables[j] = comparable;
                    }
                }
            }
        }
        for (Comparable comparable : comparables) {
            System.out.println(comparable);
        }
        return comparables;
    }
}
