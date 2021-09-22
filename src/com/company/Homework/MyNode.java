package com.company.Homework;

public class MyNode<E> {
    private E thisNode;
    private MyNode<E> nextNode;
    private MyNode<E> prevNode;

    public MyNode(E thisNode, MyNode<E> nextNode, MyNode<E> prevNode) {
        this.thisNode = thisNode;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public MyNode() {
    }

    public E getThisNode() {
        return thisNode;
    }

    public void setThisNode(E thisNode) {
        this.thisNode = thisNode;
    }

    public MyNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public MyNode<E> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(MyNode<E> prevNode) {
        this.prevNode = prevNode;
    }
}
