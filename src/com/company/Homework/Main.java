package com.company.Homework;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirstNode(1);
        myLinkedList.addLastNode(2);
        myLinkedList.addFirstNode(3);
        System.out.println(myLinkedList.getNodeByIndex(1));
    }
}
