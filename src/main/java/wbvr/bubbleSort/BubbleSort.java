package wbvr.bubbleSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = getIntegers();

        System.out.println("Applying Bubble Sort.");
        System.out.print("Original Array: ");
        bubbleSort.print(arr);
        bubbleSort.sort(arr);

        System.out.print("Sorted Array: ");
        bubbleSort.print(arr);
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

    public void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
