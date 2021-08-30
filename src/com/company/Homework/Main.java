package com.company.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Town town1 = new Town(1, "Bishkek");
        Town town2 = new Town(2, "Tokyo");
        Town town3 = new Town(3, "Kiev");
        Town town4 = new Town(4, "Almaty");
        Town town5 = new Town(5, "Berlin");
        Town town6 = new Town(6, "Delhi");
        Town town7 = new Town(7, "Chicago");
        Town town8 = new Town(8, "Paris");
        Town town9 = new Town(9, "Tashkent");
        Town town10 = new Town(10, "Moscow");
        List<Town> arrayList = new ArrayList<>();
        arrayList.add(town1);
        arrayList.add(town2);
        arrayList.add(town3);
        arrayList.add(town4);
        arrayList.add(town5);
        arrayList.add(town6);
        arrayList.add(town7);
        arrayList.add(town8);
        arrayList.add(town9);
        arrayList.add(town10);
        Set<Town> hashSet = new HashSet<>();
        Set<Town> treeSet = new TreeSet<>();
        for (Town town:arrayList) {
            if (town.getId() % 2 == 0) {
                hashSet.add(town);
            }else {
                treeSet.add(town);
            }
        }
        System.out.println(hashSet);
        System.out.println(treeSet);
        printDescOrAsc(arrayList, true);
        System.out.println();
        deleteTownWhereMoreFiveCharacter(treeSet);
        System.out.println(treeSet);
        printDescOrAsc(arrayList, false);
    }

    public static void printDescOrAsc(List<Town> list, boolean desc) {
        TreeSet<Town> treeSet = new TreeSet<>(list);
        if (desc) {
            Iterator<Town> descendingIterator = treeSet.descendingIterator();
            System.out.println("\nПо убыванию:");
            while (descendingIterator.hasNext())
                System.out.println(descendingIterator.next());
        }else {
            System.out.println("\nПо возрастанию:");
            for (Town city : treeSet)
                System.out.println(city);
        }
    }
    public static void deleteTownWhereMoreFiveCharacter(Set treeSet){
        Iterator<Town> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName().length() > 5) {
                iterator.remove();
            }
        }
    }
}
