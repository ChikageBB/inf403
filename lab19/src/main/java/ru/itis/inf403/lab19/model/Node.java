package ru.itis.inf403.lab19.model;

public class Node implements ITree {

    private Node right;
    private Node left;
    private int value;


    public Node(int value){
        this.value = value;
    }

    public int value(){
        return this.value;
    }

    public Node left(){
        return this.left;
    }

    public Node right(){
        return this.right;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public void setLeft(Node left){
        this.left = left;
    }
}
