package com.company.TaskA;

public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot();
        parrot1.setName("Кеша");
        parrot1.setAge(14);
        parrot1.setHabitat("Клетка");
        parrot1.speak();
        Parrot parrot2= new Parrot();
        parrot2.setName("Яша");
        parrot2.setAge(50);
        parrot2.setHabitat("Зоопарк");
        parrot2.speak();
        Dog dog1 = new Dog();
        dog1.setName("Бобик");
        dog1.setAge(3);
        dog1.setHabitat("Будка");
        dog1.speak();
        Dog dog2 = new Dog();
        dog2.setName("Мухтар");
        dog2.setAge(10);
        dog2.setHabitat("Полицейский участок");
        dog2.speak();
        Cat cat1 = new Cat();
        cat1.setName("Тимофей");
        cat1.setAge(13);
        cat1.setHabitat("Деревня");
        cat1.speak();
        Cat cat2 = new Cat();
        cat2.setName("Патрик");
        cat2.setAge(4);
        cat2.setHabitat("Квартира");
        cat2.speak();
        Fish fish1 = new Fish();
        fish1.setName("Дори");
        fish1.setAge(2);
        fish1.setHabitat("Океан");
        fish1.speak();
        Fish fish2 = new Fish();
        fish2.setName("Жонатан");
        fish2.setAge(1);
        fish2.setHabitat("Аквариум");
        fish2.tell();
    }
}
