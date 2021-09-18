package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(new PrinterRequest("First", 5));
//        Thread t2 = new Thread(new PrinterRequest("Second", 5));
//        Thread t3 = new Thread(new PrinterRequest("Third", 5));
//        t1.start();
//        t2.start();
//        t3.start();

        Thread pilotFirst = new Thread(new FormulaOnePilotThread(), "Шумахер");
        Thread pilotSecond = new Thread(new FormulaOnePilotThread(), "Алонсо");
        Thread pilotThird = new Thread(new FormulaOnePilotThread(), "Фетель");
        Thread pilotFourth = new Thread(new FormulaOnePilotThread(), "Хэмильтон");
        Thread pilotFifth = new Thread(new FormulaOnePilotThread(), "Сенна");
        pilotFourth.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Start!");
        pilotFirst.start();
        pilotSecond.start();
        pilotThird.start();
        pilotFourth.start();
        pilotFifth.start();
//        try {
//            Thread.sleep(1000);
//            System.out.println("finish!");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
