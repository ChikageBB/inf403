package ru.itis.inf403.lab10.model;

import java.util.LinkedList;
import java.util.Random;

public class MainLinkedList {
    public static void main(String[] args) {

        Random r = new Random();
        Node first = new Node(5);

        System.out.println("1# ---------------------------");
        for (int i = 0; i < 29; i++){
            add(first, r.nextInt(0, 100));
        }
        System.out.println(get(first, 2).value);


        System.out.println("2# ---------------------------");
        printLinkedList(first);

        System.out.println("3# ---------------------------");

        printReverse(first);
    }

    public static Node findLast(Node first){
        Node current = first;

        while (current.next != null){
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);

        last.next = newElement;
    }

    public static void printLinkedList(Node first){
        Node current = first;
        System.out.print("[ ");
        while (current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("]");
    }

    public static Node get(Node first, int num) {
        Node current = first;
        for (int i = 1; i < num; i++){
            current = current.next;
        }
        return current;
    }

    public static void printReverse(Node node){
        if (node == null){
            return;
        }
        printReverse(node.next);
        System.out.print(node.value + " ");
    }
}
