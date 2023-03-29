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
    public T popLast() {
        T popData = tail.data;
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head.data;
        } else {
            Node<T> temp;
            temp = head;
            while (temp.next != tail)
                temp = temp.next;
            temp.next = null;
            tail = temp;
        }
        return popData;
    }
    public Node<T> search(T data) {
        Node<T> temp;
        temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public boolean insertAfter(T searchData, T insertData){
        Node<T> newNode = new Node(insertData);
        Node<T> searchedNode = search(searchData);
        if(searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next=newNode;
            return true;
        }
        return false;
    }

    public void delete(T deleteData){
        if(head==null)
            return ;
        else if (head.data.equals(deleteData)) {
            head = head.next;
            return;
        }
        Node<T> previous=head;
        Node<T> present=head.next;
        while(present!=null){
            if(present.data.equals(deleteData)){
                System.out.println("deleted");
                previous.next=present.next;

            }
            previous=present;
            present=present.next;
        }
    }


}
