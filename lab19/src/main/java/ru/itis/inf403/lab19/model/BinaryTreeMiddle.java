package ru.itis.inf403.lab19.model;

public class BinaryTreeMiddle extends BinaryTree {
    @Override
    public void traversalTree(Node node){
        if (node == null) return;
        traversalTree(node.left());
        traversalTree(node.right());
        System.out.println(node.value());
    }

}
