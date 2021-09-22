package com.company.Homework;

public class MyLinkedList<E> {
    private MyNode<E> firstNode;
    private MyNode<E> lastNode;

    public MyLinkedList() {
        this.firstNode = new MyNode<>();
        this.lastNode = new MyNode<>();
    }

    public MyNode<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(MyNode<E> firstNode) {
        this.firstNode = firstNode;
    }

    public MyNode<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(MyNode<E> lastNode) {
        this.lastNode = lastNode;
    }
    public E getNodeByIndex(int index){
        MyNode<E> getIndex = this.firstNode;
        for (int i = 0; i < index; i++) {
            getIndex = getIndex.getNextNode();
        }
        return getIndex.getThisNode();
    }
    public void addFirstNode(E firstNode){
        if(this.firstNode.getThisNode() != null){
            MyNode<E> nextNode = this.firstNode;
            this.firstNode = new MyNode<>(firstNode,nextNode,null);
            nextNode.setPrevNode(this.firstNode);
        }else {
            this.firstNode.setThisNode(firstNode);
            this.firstNode.setNextNode(this.lastNode);
            this.firstNode.setPrevNode(null);
        }
    }
    public void addLastNode(E lastNode) {
        if (this.firstNode.getThisNode() == null && this.lastNode.getThisNode() == null) {
            addFirstNode(lastNode);
        }
        if(this.firstNode.getThisNode() != null && this.lastNode.getThisNode() == null){
            this.lastNode.setThisNode(lastNode);
            this.lastNode.setNextNode(null);
            this.lastNode.setPrevNode(firstNode);
        }
        if(this.lastNode.getThisNode() != null){
            MyNode<E> prev = this.lastNode;
            this.lastNode = new MyNode<>(lastNode,null,prev);
        }
    }
}
