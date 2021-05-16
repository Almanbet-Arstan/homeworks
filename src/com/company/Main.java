package com.company;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Steak", "Hot shop chef", 3, "Head chef", 50000, 10000, 500, 10, 15, "Gordon", 35, "Bishkek/Kyrgyzstan", "Male");
        Waiter waiter1 = new Waiter("Waiter", 15000, 5000, 300, 1, 15, "Azat", 19, "Bishkek/Kyrgyzstan", "Male");
        Waiter waiter2 = new Waiter("Waiter", 15000, 5000, 100, 5, 15, "Aliya", 23, "Bishkek/Kyrgyzstan", "Female");
        Waiter waiter3 = new Waiter("Waiter", 15000, 5000, 600, 4, 15, "Aktan", 22, "Bishkek/Kyrgyzstan", "Male");
        Security security = new Security(true, "Baton", "Security guard", 20000, 10000, 800, 16, 15, "Maksat", 40, "Bishkek/Kyrgyzstan", "Male");
        Client pink = new Client(true, 300, true, "Aidar", 31, "Bishkek/Kyrgyzstan", "Male");
        Client blonde = new Client(false, 1000, true, "Aziret", 25, "Bishkek/Kyrgyzstan", "Male");
        Client orange = new Client(false, 3000, true, "Albina", 35, "Bishkek/Kyrgyzstan", "Female");
        Client white = new Client(true, 800, true, "Nagima", 36, "Bishkek/Kyrgyzstan", "Female");
        Client blue = new Client(false, 2600, false, "Iskander", 70, "Bishkek/Kyrgyzstan", "Male");
        Client brown = new Client(true, 500, true, "Tilek", 45, "Bishkek/Kyrgyzstan", "Male");
        System.out.println(chef);
        System.out.println(waiter1);
        System.out.println(waiter2);
        System.out.println(waiter3);
        System.out.println(security);
        System.out.println(pink);
        System.out.println(blonde);
        System.out.println(orange);
        System.out.println(white);
        System.out.println(blue);
        System.out.println(brown);
    }
}
