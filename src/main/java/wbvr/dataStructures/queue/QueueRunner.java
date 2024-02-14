package wbvr.dataStructures.queue;

import wbvr.dataStructures.IRunner;

import java.util.Scanner;

public class QueueRunner implements IRunner {
    @Override
    public void run() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        System.out.println("Queue Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, queue);
        } while (!choice.equals("G"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Queue Action:");
        System.out.println("A: enqueue");
        System.out.println("B: dequeue");
        System.out.println("C: first");
        System.out.println("D: isEmpty");
        System.out.println("E: size");
        System.out.println("F: print");
        System.out.println("G: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, LinkedListQueue<String> queue) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case "A":
                System.out.print("Enter the Element to Enqueue: ");
                queue.enqueue(scanner.nextLine());

                System.out.print("Element Successfully Added: ");
                queue.print();
                break;
            case "B":
                if (queue.isEmpty()) {
                    queue.dequeue();
                    break;
                }

                System.out.println("Element Removed: " + queue.dequeue());
                System.out.print("Current Queue: ");
                queue.print();
                break;
            case "C":
                System.out.print("First Element of the Queue: ");
                queue.first();
                break;
            case "D":
                System.out.println("Queue is Empty?: " + queue.isEmpty());
                break;
            case "E":
                System.out.println("Queue Size: " + queue.size());
                break;
            case "F":
                System.out.print("Queue: ");
                queue.print();
                break;
            case "G":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
