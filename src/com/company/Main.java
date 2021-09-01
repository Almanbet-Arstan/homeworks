package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        System.out.println(isNeighbors(arrayList));
    }
    public static boolean isNeighbors(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i-1))){
                return true;
            }
        }
        return false;
    }
}
