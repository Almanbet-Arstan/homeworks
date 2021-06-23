package com.company.Homework.TaskA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> arrayListOfCats = new ArrayList<>();
        LinkedList<Cat> linkedListOfCats = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayListOfCats.add(new Cat());
            linkedListOfCats.add(new Cat());
        }
        System.out.println("Выполнение arrayList с добавлением в середину заняло: " + countWorkingSeconds(arrayListOfCats, arrayListOfCats.size()/2) + " миллисекунд");
        System.out.println("Выполнение linkedList  с добавлением в середину заняло: " + countWorkingSeconds(linkedListOfCats, arrayListOfCats.size()/2) + " миллисекунд");
        System.out.println("Выполнение arrayList  с добавлением в начало и конец заняло: " + (countWorkingSeconds(arrayListOfCats, 0) + countWorkingSeconds(arrayListOfCats, arrayListOfCats.size())) + " миллисекунд");
        System.out.println("Выполнение linkedList  с добавлением в начало и конец заняло: " + (countWorkingSeconds(linkedListOfCats, 0) + countWorkingSeconds(linkedListOfCats, linkedListOfCats.size())) + " миллисекунд");
        System.out.println("Считывание arrayList  с середины и с конца заняло: " + (getFromList(arrayListOfCats, arrayListOfCats.size()/2) + getFromList(arrayListOfCats, arrayListOfCats.size() - 1)) + " миллисекунд");
        System.out.println("Считывание linkedList  с середины и с конца заняло: " + (getFromList(linkedListOfCats, linkedListOfCats.size()/2) + getFromList(linkedListOfCats, linkedListOfCats.size() - 1)) + " миллисекунд");
        System.out.println("Выполнение arrayList  с удалением в середине и в начале заняло: " + (removeFromList(arrayListOfCats, arrayListOfCats.size()/2) + removeFromList(arrayListOfCats, 0)) + " миллисекунд");
        System.out.println("Выполнение linkedList  с удалением в середине и в начале заняло: " + (removeFromList(linkedListOfCats, linkedListOfCats.size() / 2) + removeFromList(linkedListOfCats, 0)) + " миллисекунд");
    }
    public static int countWorkingSeconds (List <Cat> list, int index){
        long millisBefore = System.currentTimeMillis();  // засекаем перед

        for (int k = 0; k < 100; k++) {
            list.add(index, new Cat());
        }

        long millisAfter = System.currentTimeMillis();  // засекаем после

        return (int) (millisAfter - millisBefore);
    }
    public static int getFromList(List<Cat> list, int index) {
        long millisBefore = System.currentTimeMillis();  // засекаем перед

        list.get(index);

        long millisAfter = System.currentTimeMillis();  // засекаем после

        return (int) (millisAfter - millisBefore);
    }
    public static int removeFromList (List<Cat> list, int index){
        long millisBefore = System.currentTimeMillis();  // засекаем перед

        list.remove(index);

        long millisAfter = System.currentTimeMillis();  // засекаем после

        return (int) (millisAfter - millisBefore);
    }
}
