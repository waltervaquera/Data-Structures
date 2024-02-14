package wbvr.dataStructures.doublyLinkedList;

import wbvr.dataStructures.IRunner;

import java.util.Scanner;

public class DoublyLinkedListRunner implements IRunner {
    @Override
    public void run() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        System.out.println("Doubly Linked List Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, doublyLinkedList);
        } while (!choice.equals("J"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Doubly Linked List Action:");
        System.out.println("A: size");
        System.out.println("B: isEmpty");
        System.out.println("C: first");
        System.out.println("D: last");
        System.out.println("E: addFirst");
        System.out.println("F: addLast");
        System.out.println("G: removeFirst");
        System.out.println("H: removeLast");
        System.out.println("I: print");
        System.out.println("J: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, DoublyLinkedList<String> doublyLinkedList) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case "A":
                System.out.println("Doubly Linked List Size: " + doublyLinkedList.size());
                break;
            case "B":
                System.out.println("Doubly Linked List is Empty?: " + doublyLinkedList.isEmpty());
                break;
            case "C":
                if (doublyLinkedList.isEmpty()) {
                    System.out.println("There is no first element, Doubly Linked List empty.");
                    break;
                }

                System.out.println("Doubly Linked List First Element: " + doublyLinkedList.first().getData());
                break;
            case "D":
                if (doublyLinkedList.isEmpty()) {
                    System.out.println("There is no last element, Doubly Linked List empty.");
                    break;
                }

                System.out.println("Doubly Linked List Last Element: " + doublyLinkedList.last().getData());
                break;
            case "E":
                System.out.print("Enter the Element to add First: ");
                doublyLinkedList.addFirst(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                doublyLinkedList.print();
                break;
            case "F":
                System.out.print("Enter the Element to add Last: ");
                doublyLinkedList.addLast(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                doublyLinkedList.print();
                break;
            case "G":
                if (doublyLinkedList.isEmpty()) {
                    doublyLinkedList.removeFirst();
                    break;
                }

                doublyLinkedList.removeFirst();
                System.out.println("First Element Successfully Removed.");
                System.out.print("Current Doubly Linked List: ");
                doublyLinkedList.print();
                break;
            case "H":
                if (doublyLinkedList.isEmpty()) {
                    doublyLinkedList.removeLast();
                    break;
                }

                doublyLinkedList.removeLast();
                System.out.println("Last Element Successfully Removed.");
                System.out.print("Current Doubly Linked List: ");
                doublyLinkedList.print();
                break;
            case "I":
                System.out.print("Doubly Linked List: ");
                doublyLinkedList.print();
                break;
            case "J":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
