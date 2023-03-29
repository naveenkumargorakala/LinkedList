package com.bridgelabz.DataStructures.Linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void show() {
        Node<T> temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insert(T insertData) {
        Node<T> newNode = new Node<>(insertData);
        //Node<T> searchNode = search(searchData);
        head.next = newNode;
        newNode.next = tail;
    }
    public T pop() {
        T popData=head.data;
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return null;
        } else
            head = head.next;

        return popData;
    }


}
