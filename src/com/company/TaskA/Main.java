package com.company.TaskA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        City[] cities = new City[3];
        Village[] villages = new Village[2];
        District[] districtsOfBishkek = new District[4];
        districtsOfBishkek[0] = new District("Азирет Раманкулов", "Октябрьский", 250000, 40);
        districtsOfBishkek[1] = new District("Улан Ырымбеков", "Ленинский", 250000, 43);
        districtsOfBishkek[2] = new District("Астан Сериков", "Свердловский", 250000, 43);
        districtsOfBishkek[3] = new District("Максат Турдуев", "Первомайский", 250000, 43);
        cities[0] = new City("Нариман Тулеев", "Бишкек", 1000000,169, districtsOfBishkek);
        District[] districtsOfJalalAbad = new District[2];
        districtsOfJalalAbad[0] = new District("Шамиль Ярмагамедов", "Спутник", 50000, 12);
        districtsOfJalalAbad[1] = new District("Амир Аманкулов", "Курманбек", 50000, 12);
        cities[1] = new City("Адиль Жоробаев", "Жалал-Абад", 109000, 25, districtsOfJalalAbad);
        District[] districtsOfIssykKol = new District[2];
        districtsOfIssykKol[0] = new District("Эльдар Молдоканов", "3 микрорайон", 5000, 10);
        districtsOfIssykKol[1] = new District("Пазилов Ибрагим", "2 микрорайон", 7000, 13);
        cities[2] = new City("Эльчибек Жантаев", "Чолпон-Ата", 14300, 25, districtsOfIssykKol);
        villages[0] = new Village("Койлубай Мамыров", "Манас", 20000, 10);
        villages[1] = new Village("Максим Малкин", "Военно-Антоновка", 11356, 8);
        Country country = new Country("Садыр Жапаров", "Кыргызстан", 6500000, 199951, cities, villages);

        System.out.println("Введите кого хотите найти: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < cities.length; i++) {
            if(cities[i].getDirector().equals(name)){
                System.out.println("Такой человек нашелся");
                System.out.printf("%s является главой города %s, населенность которого %s человек, а площадь равна %s квадратных киллометров.\n", cities[i].getDirector(), cities[i].getName(), cities[i].getPopulation(), cities[i].getSquare());
            }
            for (int j = 0; j < cities[i].districts.length; j++) {
                if(cities[i].districts[j].getDirector().equals(name)){
                    System.out.println("Такой человек нашелся");
                    System.out.printf("%s является главой района %s в городе %s, населенность которого %s человек, а площадь равна %s квадратных киллометров.\n", cities[i].districts[j].getDirector(), cities[i].districts[j].getName(), cities[i].getName(), cities[i].districts[j].getPopulation(), cities[i].districts[j].getSquare());
                }
            }
        }
        for (int k = 0; k < villages.length; k++) {
            if(villages[k].getDirector().equals(name)){
                System.out.println("Такой человек нашелся");
                System.out.printf("%s является главой поселка %s, населенность которого %s человек, а площадь равна %s квадратных киллометров.\n", villages[k].getDirector(), villages[k].getName(), villages[k].getPopulation(), villages[k].getSquare());
            }
        }
    }
}
