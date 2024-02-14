package wbvr.dataStructures.stack;

import wbvr.dataStructures.IRunner;

import java.util.Scanner;

public class StackRunner implements IRunner {
    @Override
    public void run() {
        LinkedListStack<String> stack = new LinkedListStack<>();
        System.out.println("Stack Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, stack);
        } while (!choice.equals("G"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Stack Action:");
        System.out.println("A: push");
        System.out.println("B: pop");
        System.out.println("C: top");
        System.out.println("D: isEmpty");
        System.out.println("E: size");
        System.out.println("F: print");
        System.out.println("G: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, LinkedListStack<String> stack) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case "A":
                System.out.print("Enter the Element to Push: ");
                stack.push(scanner.nextLine());

                System.out.print("Element Successfully Pushed: ");
                stack.print();
                break;
            case "B":
                if (stack.isEmpty()) {
                    stack.pop();
                    break;
                }

                System.out.println("Element Removed: " + stack.pop());
                System.out.print("Current Stack: ");
                stack.print();
                break;
            case "C":
                System.out.print("Top Element of the Stack: ");
                stack.top();
                break;
            case "D":
                System.out.println("Stack is Empty?: " + stack.isEmpty());
                break;
            case "E":
                System.out.println("Stack Size: " + stack.size());
                break;
            case "F":
                System.out.print("Stack: ");
                stack.print();
                break;
            case "G":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
