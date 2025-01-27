package ru.itis.inf403.lab19.model;

public class BinaryTreeLeft extends BinaryTree{
    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.left());
        System.out.println(node.value());
        traversalTree(node.right());
    }
}
