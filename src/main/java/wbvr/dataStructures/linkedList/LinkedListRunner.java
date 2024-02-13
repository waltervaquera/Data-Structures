package wbvr.dataStructures.linkedList;

import wbvr.dataStructures.IRunner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Linked list size: " + list.size());
//      print menu
//      read inputs
        list.addLast("ewe");
        list.addFirst("owo");
        list.addFirst("uwu");
        list.print();
        System.out.println("Linked list size: " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Linked list size: " + list.size());
    }
}
