package wbvr.dataStructures.binaryTree;

import wbvr.dataStructures.IRunner;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTreeRunner implements IRunner {
    @Override
    public void run() {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Binary Tree Created.");

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            action(choice, binaryTree);
        } while (!choice.equals("L"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose a Binary Tree Action:");
        System.out.println("A: insert");
        System.out.println("B: search");
        System.out.println("C: getRoot");
        System.out.println("D: getNode");
        System.out.println("E: delete");
        System.out.println("F: preOrder");
        System.out.println("G: inOrder");
        System.out.println("H: postOrder");
        System.out.println("I: height");
        System.out.println("J: size");
        System.out.println("K: print");
        System.out.println("L: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice, BinaryTree binaryTree) {
        Scanner scanner = new Scanner(System.in);
        BTNode node;
        switch (choice) {
            case "A":
                System.out.print("Enter the Integer to Insert: ");
                binaryTree.insert(scanner.nextInt());

                System.out.print("Element Successfully Inserted: ");
                binaryTree.print();
                break;
            case "B":
                System.out.print("Enter the Integer to Search: ");
                System.out.println("Found Element: " + binaryTree.search(scanner.nextInt()));
                break;
            case "C":
                if (binaryTree.size() == 0) {
                    System.out.println("There is no Root Element, Binary Tree Empty.");
                    break;
                }

                System.out.println("Root Element: " + binaryTree.getRoot());
                break;
            case "D":
                System.out.print("Enter the Integer to Get: ");
                node = binaryTree.getNode(scanner.nextInt());

                if (node == null) {
                    System.out.println("Element Not Found.");
                    break;
                }

                System.out.println("Found Element: " + node);
                break;
            case "E":
                System.out.print("Enter the Integer to Delete: ");
                node = binaryTree.getNode(scanner.nextInt());

                if (node == null) {
                    System.out.println("Element Not Found.");
                    break;
                }

                binaryTree.delete(node.data);
                System.out.println("Element Successfully Deleted.");
                System.out.print("Current Binary Tree (Pre-Order): ");
                binaryTree.print();
                break;
            case "F":
                System.out.println("Pre-Order: " + Arrays.toString(binaryTree.preOrder()));
                break;
            case "G":
                System.out.println("In-Order: " + Arrays.toString(binaryTree.inOrder()));
                break;
            case "H":
                System.out.println("Post-Order: " + Arrays.toString(binaryTree.postOrder()));
                break;
            case "I":
                System.out.println("Binary Tree Height: " + binaryTree.height());
                break;
            case "J":
                System.out.println("Binary Tree Size: " + binaryTree.size());
                break;
            case "K":
                System.out.print("Binary Tree (Pre-Order): ");
                binaryTree.print();
                break;
            case "L":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
