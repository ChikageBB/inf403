package ru.itis.inf403.lab19.model;


//1. Описать интерфейс ITree (left(), right(), int value())
//2. Описать абстрактный класс BinaryTree
//    бинарное дерево в котором значение левого потомка <= узла
//   значение правого потомка > значению узла
//    абстрактный метод traversalTree()
//    метод ввода дерева через аргумент-массив целых чисел
//3. реализовать три класса
//- обход слева
//- обход справа
//- центральный обход

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[]{5, 6, 7, 4, 2, 3, 4, 1};

        Node root = new Node(arr[0]);
        BinaryTreeLeft binaryTreeLeft = new BinaryTreeLeft();

        for (int i = 1; i < arr.length; i++){
            binaryTreeLeft.addLeaf(arr[i], root);
        }


        binaryTreeLeft.traversalTree(root);



    }
}
