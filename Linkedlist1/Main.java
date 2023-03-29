package com.bridgelabz.DataStructures.Linkedlist;

public class Main<T> {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("pushing of elements: ");
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.show();

        LinkedList<Integer> linkedList1 = new LinkedList();
        System.out.println("appending elements: ");
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);
        linkedList1.show();

    }

}
