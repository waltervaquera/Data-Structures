package wbvr.dataStructures.linkedlist;

import wbvr.dataStructures.interfaces.IRunner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        System.out.println("Doubly Linked list size: " + list.size());
//      print menu
//      read inputs
        list.addLast("ewe");
        list.addFirst("owo");
        list.addFirst("uwu");
        list.print();
        System.out.println("Doubly Linked list size: " + list.size());
    }
}
