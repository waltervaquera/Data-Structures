package wbvr.dataStructures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            IRunner manager = RunnerFactory.getRunner(choice);
            manager.run();
        } while (!choice.equals("H"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Data Structure:");
        System.out.println("A: Linked List");
        System.out.println("B: Doubly Linked List");
        System.out.println("C: Stack");
        System.out.println("D: Queue");
        System.out.println("E: Binary Tree");
        System.out.println("F: Graph");
        System.out.println("G: Sorting Algorithms");
        System.out.println("H: Exit");
        System.out.println("------------------------");
    }
}