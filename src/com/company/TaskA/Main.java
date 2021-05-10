package com.company.TaskA;

public class Main {
    public static void main(String[] args) {
        Cow[] cows = new Cow[5];
        cows[0] = new Cow(345,23,"Female","Gazel");
        cows[1] = new Cow(427, 32, "Female", "Avrora");
        cows[2] = new Cow(468,34,"Female","Eva");
        cows[3] = new Cow(396,28,"Female","Kandy");
        cows[4] = new Cow(410,30,"Female","Alisa");
        Sheep[] sheeps = new Sheep[3];
        sheeps[0] = new Sheep(60,7,"Female","Vatrushka");
        sheeps[1] = new Sheep(45,12,"Female","Liliya");
        sheeps[2] = new Sheep(57,9,"Female","Vishenka");
        Horse[] horses = new Horse[2];
        horses[0] = new Horse(1000, 43, "White", "Male", "Akkula");
        horses[1] = new Horse(500, 28, "black", "Female", "Bozjorgo");
        Farm farm1 = new Farm("Bishkek, Kyrgyzstan", cows, sheeps, horses, "Akybaev Atai Akybaevich");
        System.out.println(farm1);
        // Здесь я не понял как бы я мог вывести объекты без массива, если я создам отдельные свойства, то 2 ферма массивы будут выводится null, что не очень красиво
        //Изначально думал что для фермы1 заполню объекты сам, а для 2фермы объекты заполнятся сами по умолчанию, но проблемы с null'ами появились
        //Если есть другой выход или я где то совершил ошибку или это правильный ответ напишите в отзыве пожайлуста!
        Cow[] cow = new Cow[1];
        cow[0] = new Cow();
        Sheep[] sheep = new Sheep[1];
        sheep[0] = new Sheep();
        Horse[] horse = new Horse[1];
        horse[0] = new Horse();
        Farm farm2 = new Farm("Naryn, Kyrgyzstan", cow, sheep, horse, "Yrymbekov Ulan Yrymbekovich");
        System.out.println(farm2);
    }
}