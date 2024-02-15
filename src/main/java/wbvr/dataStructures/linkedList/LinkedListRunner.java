package wbvr.dataStructures.linkedList;

import wbvr.dataStructures.IRunner;

import java.util.Scanner;

public class LinkedListRunner implements IRunner {
    @Override
    public void run() {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Linked List Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, linkedList);
        } while (!choice.equals("I"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Linked List Action:");
        System.out.println("A: size");
        System.out.println("B: isEmpty");
        System.out.println("C: first");
        System.out.println("D: last");
        System.out.println("E: addFirst");
        System.out.println("F: addLast");
        System.out.println("G: removeFirst");
        System.out.println("H: print");
        System.out.println("I: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, LinkedList<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case "A":
                System.out.println("Linked List Size: " + linkedList.size());
                break;
            case "B":
                System.out.println("Linked List is Empty?: " + linkedList.isEmpty());
                break;
            case "C":
                if (linkedList.isEmpty()) {
                    System.out.println("There is no first element, Linked List empty.");
                    break;
                }

                System.out.println("Linked List First Element: " + linkedList.first());
                break;
            case "D":
                if (linkedList.isEmpty()) {
                    System.out.println("There is no last element, Linked List empty.");
                    break;
                }

                System.out.println("Linked List Last Element: " + linkedList.last());
                break;
            case "E":
                System.out.print("Enter the Element to add First: ");
                linkedList.addFirst(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                linkedList.print();
                break;
            case "F":
                System.out.print("Enter the Element to add Last: ");
                linkedList.addLast(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                linkedList.print();
                break;
            case "G":
                if (linkedList.isEmpty()) {
                    linkedList.removeFirst();
                    break;
                }

                linkedList.removeFirst();
                System.out.println("Element Successfully Removed.");
                System.out.print("Current Linked List: ");
                linkedList.print();
                break;
            case "H":
                System.out.print("Linked List: ");
                linkedList.print();
                break;
            case "I":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
