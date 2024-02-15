package wbvr.dataStructures.sortingAlgorithms;

import wbvr.dataStructures.IRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortRunner implements IRunner {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            action(choice);
        } while (!choice.equals("D"));
    }

    private static void printMenu() {
        System.out.println("------------------------");
        System.out.println("Choose an Action:");
        System.out.println("A: Merge Sort");
        System.out.println("B: Quick Sort");
        System.out.println("C: Selection Sort");
        System.out.println("D: Exit Menu");
        System.out.println("------------------------");
    }

    private void action(String choice) {
        int[] arr;
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();
        SelectionSort selectionSort = new SelectionSort();

        switch (choice) {
            case "A":
                arr = getIntegers();
                System.out.println("Applying Merge Sort.");
                mergeSort.run(arr);
                break;
            case "B":
                arr = getIntegers();
                System.out.println("Applying Quick Sort.");
                quickSort.run(arr);
                break;
            case "C":
                arr = getIntegers();
                System.out.println("Applying Selection Sort.");
                selectionSort.run(arr);
                break;
            case "D":
                System.out.println("Exiting Menu...");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integersList = new ArrayList<>();

        System.out.println("Enter Integers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                integersList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'done' to finish.");
            }
        }

        int[] integersArray = new int[integersList.size()];
        for (int i = 0; i < integersList.size(); i++) {
            integersArray[i] = integersList.get(i);
        }

        return integersArray;
    }
}
