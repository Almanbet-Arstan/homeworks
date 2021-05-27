package com.company.TaskA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        District[] districtsOfBishkek = new District[4];
        districtsOfBishkek[0] = new District("Aziret Ramankulov", "Oktyabrskiy", 250000, 40);
        districtsOfBishkek[1] = new District("Ulan Yrymbekov", "Leninskiy", 250000, 43);
        districtsOfBishkek[2] = new District("Astan Serikov", "Sverdlovskiy", 250000, 43);
        districtsOfBishkek[3] = new District("Maksat Turduev", "Pervomayskiy", 250000, 43);
        City city = new City("Nariman Tuleev", "Bishkek", 1000000,169, districtsOfBishkek);
        District[] districtsOfJalalAbad = new District[2];
        districtsOfJalalAbad[0] = new District("Shamil Yarmagamedov", "Sputnik", 50000, 12);
        districtsOfJalalAbad[1] = new District("Amir Amankulov", "Kurmanbek", 50000, 12);
        City city1 = new City("Adil Jorobaev", "Jalal-Abad", 109000, 25, districtsOfJalalAbad);
        District[] districtsOfIssykKol = new District[2];
        districtsOfIssykKol[0] = new District("Eldar Moldokanov", "3 mikrorayon", 5000, 10);
        districtsOfIssykKol[1] = new District("Pazilov Ibragim", "2 mikrorayon", 7000, 13);
        City city2 = new City("Elchibek Jantaev", "Cholpon-Ata", 14300, 25, districtsOfIssykKol);
        Village village = new Village("Koylubay Mamyrov", "Manas", 20000, 10);
        Village village1 = new Village("Maksim Malkin", "Voenno-Antonovka", 11356, 8);

        System.out.println("Введите кого хотите найти: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        public String searchDirector(String name) {
            if (name.director.equals(director)) {
                return String.format("Имя %s", getDirector());
            }
            return null;
        }
    }
}
