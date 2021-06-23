package com.company.Homework.TaskB;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> animals = new LinkedList<>();
        // создал лист и вложил объекты собак и кошек
        for (int i = 0; i < 50; i++) {
            animals.add(new Cat("Cat " + (i + 1), i + 1));
            animals.add(new Dog("Dog " + (i + 1), i + 1));
        }

        int coutCat = 0; // счетчик для удаления кошек
        int coutDog = 0;// счетчик для добавления мышей
        for (int i = 0; i < animals.size(); i++) {
            // проходимся по кошкам и собакам
            if (animals.get(i) instanceof Cat) {
                // если животное кошка то плюсуем счетчик
                coutCat++;
                if (coutCat % 5 == 0) {
                    // удаляем каждую 5 кошку
                    animals.remove(i);
                }
            }
            if (animals.get(i) instanceof Dog) {
                // если животное собака то плюсуем счетчик
                coutDog++;
                if (coutDog % 3 == 0) {
                    // добавляю мышь после каждой 3-ей собаки
                    animals.add(i + 1, new Mouse("Mouse " + i, i));
                }
            }
        }
        LinkedList<Object> catAndMouse = new LinkedList<>(); // Лист для переноса рядом стоящих мышей и кошек
        ArrayList<Object> newAnimals = new ArrayList<>(); //  Лист для переноса всего из пункта 4 в ArrayList
        LinkedList<Object> sortedAnimals = new LinkedList<>(); // Лист для переноса всего сортированным

        newAnimals.addAll(animals);


        int countAgeMouse = 0; //  переменная для суммы возраста мышей
        int countAgeCat = 0; // переменая для суммы возраста котов
        int countAgeDog = 0;// переменая для суммы возраста собак
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Mouse) {
                countAgeMouse += ((Mouse) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Cat) {
                countAgeCat += ((Cat) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Dog) {
                countAgeDog += ((Dog) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse || animals.get(i) instanceof Mouse && animals.get(i + 1) instanceof Cat){
                catAndMouse.add(animals.get(i));
            }
            // тут не получилось добавить кошек, только мышей почему то
        }



        // копирую все из старого листа в новый с условием сортировки
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                // если класс кошка то добавляю ее в начало массива
                sortedAnimals.add(0, animals.get(i));

            }
            if (animals.get(i) instanceof Dog) {
                // если класс собака то добавляем по середине
                sortedAnimals.add(sortedAnimals.size() / 2 , animals.get(i));
            }
            if (animals.get(i) instanceof Mouse) {
                // добавляю мышей в конец списка
                sortedAnimals.add(sortedAnimals.size(), animals.get(i));
            }
        }
        for (int i = 0; i < sortedAnimals.size(); i++) {
            // выводим
            System.out.println(sortedAnimals.get(i));
        }

        System.out.println();
        System.out.println("Общая сумма возраста всех мышей " + countAgeMouse);
        System.out.println("Общая сумма возраста всех кошек " + countAgeCat);
        System.out.println("Общая сумма возраста всех собак " + countAgeDog);
    }
}
