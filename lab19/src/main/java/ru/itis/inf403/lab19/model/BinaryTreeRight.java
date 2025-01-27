package ru.itis.inf403.lab19.model;


public class BinaryTreeRight extends BinaryTree{


    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        System.out.println(node.value());
        traversalTree(node.left());
        traversalTree(node.right());
    }
}
