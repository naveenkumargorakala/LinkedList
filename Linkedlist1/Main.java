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
        LinkedList<Integer> linkedList2 = new LinkedList();
        linkedList2.add(70);
        linkedList2.push(56);
        System.out.println("before insert: ");
        linkedList2.show();
        linkedList2.insert(30);
        System.out.println("after insert: ");
        linkedList2.show();
    }

}
