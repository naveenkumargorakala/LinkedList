package com.bridgelabz.DataStructures.Linkedlist;

public class Main<T> {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("pushing of elements: ");
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.show();
        //remove headnode
        Integer popData1 = linkedList.pop();
        System.out.println("after pop: " + popData1);
        linkedList.show();

        LinkedList<Integer> linkedList1 = new LinkedList();
        System.out.println("appending elements: ");
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);
        linkedList1.show();
        //remove last node
        Integer popData2 = linkedList1.popLast();
        System.out.println("after popLast: " + popData2);
        linkedList1.show();

        LinkedList<Integer> linkedList2 = new LinkedList();
        linkedList2.add(70);
        linkedList2.push(56);
        System.out.println("before insert: ");
        linkedList2.show();
        linkedList2.insert(30);
        System.out.println("after insert: ");
        linkedList2.show();
        //searching
        Node<Integer> searcheddata = linkedList2.search(30);
        if (searcheddata == null) {
            System.out.println("element not found");
        } else {
            System.out.println("element found!!!");
        }

        System.out.println("element insertion after an element");
        boolean isInserted = linkedList2.insertAfter(30, 40);
        if (isInserted) {
            System.out.println("element added successfully!!!");
        } else {
            System.out.println("no element added!!!");
        }
        linkedList2.show();
        //delete an element
        linkedList2.delete(40);
        System.out.println("deleted after:");
        linkedList2.show();
    }
}
