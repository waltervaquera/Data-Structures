package wbvr.dataStructures;

import wbvr.dataStructures.interfaces.IRunner;

public class Main {
    public static void main(String[] args) {
        printMenu();
//      read input
        IRunner manager = RunnerFactory.getManager("A");
        manager.run();
    }

    private static void printMenu() {
        System.out.println("Choose a data structure:");
        System.out.println("A: Linked List");
    }
}