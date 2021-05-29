package com.company.Classwork;

public class Main {
    public static void main(String[] args) {
        Writable writable1 = new WhiteBoard();
        Writable writable2 = new BlackBoard();
        writable1.write();
        writable2.write();
        handleWrite(writable1);
        handleWrite(writable2);
    }

    public static void handleWrite(Writable writable) {
        writable.write();
    }
}
