package wbvr.dataStructures.deque;

import wbvr.dataStructures.IRunner;

import java.util.Scanner;

public class DequeRunner implements IRunner {
    @Override
    public void run() {
        LinkedListDeque<String> deque = new LinkedListDeque<>();
        System.out.println("Deque Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            action(choice, deque);
        } while (!choice.equals("J"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Deque Action:");
        System.out.println("A: addFirst");
        System.out.println("B: addLast");
        System.out.println("C: removeFirst");
        System.out.println("D: removeLast");
        System.out.println("E: first");
        System.out.println("F: last");
        System.out.println("G: size");
        System.out.println("H: isEmpty");
        System.out.println("I: print");
        System.out.println("J: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, LinkedListDeque<String> deque) {
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case "A":
                System.out.print("Enter the Element to Add First: ");
                deque.addFirst(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                deque.print();
                break;
            case "B":
                System.out.print("Enter the Element to Add Last: ");
                deque.addLast(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                deque.print();
                break;
            case "C":
                if (deque.isEmpty()) {
                    deque.removeFirst();
                    break;
                }

                System.out.println("First Element Removed: " + deque.removeFirst());
                System.out.print("Current Deque: ");
                deque.print();
                break;
            case "D":
                if (deque.isEmpty()) {
                    deque.removeLast();
                    break;
                }

                System.out.println("Last Element Removed: " + deque.removeLast());
                System.out.print("Current Deque: ");
                deque.print();
                break;
            case "E":
                if (deque.isEmpty()) {
                    deque.first();
                    break;
                }

                System.out.println("First Element of the Deque: " + deque.first());
                break;
            case "F":
                if (deque.isEmpty()) {
                    deque.last();
                    break;
                }

                System.out.println("Last Element of the Deque: " + deque.last());
                break;
            case "G":
                System.out.println("Deque Size: " + deque.size());
                break;
            case "H":
                System.out.println("Deque is Empty?: " + deque.isEmpty());
                break;
            case "I":
                System.out.print("Deque: ");
                deque.print();
                break;
            case "J":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
