package ru.itis.inf403.lab12.model;

import java.util.Collections;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(Apple apple){
        Node newNode = new Node(apple);
        if (head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        ++size;
    }

    public void addLast(Apple apple){
        Node newNode = new Node(apple);

        if (tail == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        ++size;
    }

    public int size(){
        return size;
    }

    public void removeLast(){
        if (tail == null){
            throw new IllegalStateException("DoubleLinkedList is empty");
        }else {
            tail = tail.prev;
            if (tail == null){
                head = null;
            }else {
                tail.next = null;
            }
        }
    }

    public void removeFirst(){
        if (head == null){
            throw new IllegalStateException("DoubleLinkedList is empty");
        }else{
            head = head.next;
            if (head == null){
                tail = null;
            }else{
                head.prev = null;
            }
        }
    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.apple + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reversePrint(){
        Node current = tail;
        while (current != null){
            System.out.println(current.apple + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void forwardSort(){
        if (head == null) return;

        Node current = head.next;
        while (current != null){
            Node present = current;
            Node prev = current.prev;

            while (prev != null && present.apple.compare(prev.apple) == -1){
                Apple temp = prev.apple;
                present.apple = prev.apple;
                prev.apple = temp;

                present = prev;
                prev = prev.prev;
            }
            current = current.next;
        }
    }
}
