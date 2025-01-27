package ru.itis.inf403.lab19.model;

public abstract class BinaryTree {

    public abstract void traversalTree(Node node);

    public void addLeaf(int n, Node node) {
        if (n > node.value()) {
            if (node.right() == null) {
                Node usel = new Node(n);
                node.setRight(usel);
                return;
            } else {
                addLeaf(n, node.right());
            }
        } else {
            if (node.left() == null) {
                Node usel = new Node(n);
                node.setLeft(usel);
                return;
            } else {
                addLeaf(n, node.left());
            }
        }
    }
}
