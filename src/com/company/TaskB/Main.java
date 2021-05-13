package com.company.TaskB;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.setWeight(555);
        bread.setPrice(100);
        bread.setProducerCompany("HBK");
        bread.bake();
        bread.pack();
        bread.setName("Советская буханка");
        System.out.println();
        Lepeshka lepeshka = new Lepeshka(300.0, 10);
        lepeshka.setName("Узбекская лепешка из горячего тандыра");
        lepeshka.drawPrints();
        lepeshka.bake();
        lepeshka.varnish();
        lepeshka.pack();
        lepeshka.setPrice(150);
        System.out.println();
        Lavash lavash = new Lavash();
        lavash.setName("Элитный лаваш из Дилижана");
        lavash.bake();
        lavash.wrapItUp();
        System.out.println();
        Baguette baguette = new Baguette(50, 5);
        baguette.setName("Провансальский багет");
        baguette.scarring();
        baguette.pack();
        System.out.println();
        System.out.println(bread.getName());
        System.out.println(lepeshka.getName());
        System.out.println(lavash.getName());
        System.out.println(baguette.getName());
    }
}
