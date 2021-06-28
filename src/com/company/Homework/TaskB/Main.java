package com.company.Homework.TaskB;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Object> months = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            months.add(i, random.nextInt(12) + 1);
        }
        System.out.println(months);
        returnTheMonth(months);
        System.out.println(months);
        Object[] monthsOfYear = months.toArray(new Object[months.size()]);
        for (int i = 0; i < monthsOfYear.length; i++) {
            System.out.println(monthsOfYear[i]);
        }
        List<Object> linkedList = new LinkedList<>(Arrays.asList(monthsOfYear));
        System.out.println(linkedList);
        System.out.println("После сортировки\n\n\n");
        sort(months);// Сортируем ArrayList
        System.out.println(months);
        sort(monthsOfYear);// Сортируем массив
        for (int i = 0; i < monthsOfYear.length; i++) {
            System.out.println(monthsOfYear[i]);
        }
        sort(linkedList);// Сортируем LinkedList
        System.out.println(linkedList);
    }

    public static void returnTheMonth(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                arrayList.set(i, getByCode((Integer) arrayList.get(i)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static Months getByCode(int code) throws Exception {
        for (Months month : Months.values()) {
            if (month.getCode() == code){
                return month;
            }
        }
        throw new Exception("No such month");
    }
    public static void sort(ArrayList<Object> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size();j++){
                if (arrayList.get(i) instanceof Months && arrayList.get(j) instanceof Months){
                    if(((Months) arrayList.get(i)).getCode() > ((Months) arrayList.get(j)).getCode()){
                        Object sort = arrayList.get(i);
                        arrayList.set(i,arrayList.get(j));
                        arrayList.set(j,sort);
                    }
                }
            }
        }
    }
    public static void sort(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] instanceof Months && array[j] instanceof Months){
                    if (((Months) array[i]).getCode() > ((Months) array[j]).getCode()) {
                        Object sort = array[i];
                        array[i] = array[j];
                        array[j] = sort;
                    }
                }
            }
        }
    }
    public static void sort(List<Object> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = i + 1; j < linkedList.size();j++){
                if (linkedList.get(i) instanceof Months && linkedList.get(j) instanceof Months){
                    if(((Months) linkedList.get(i)).getCode() > ((Months) linkedList.get(j)).getCode()){
                        Object sort = linkedList.get(i);
                        linkedList.set(i,linkedList.get(j));
                        linkedList.set(j,sort);
                    }
                }
            }
        }
    }
}