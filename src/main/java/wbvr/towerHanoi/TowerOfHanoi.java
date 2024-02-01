package wbvr.towerHanoi;

import wbvr.dataStructures.stack.LinkedListStack;

import java.util.Scanner;

public class TowerOfHanoi {
    private final LinkedListStack<Integer> source;
    private final LinkedListStack<Integer> auxiliary;
    private final LinkedListStack<Integer> destination;

    public TowerOfHanoi(int numberOfDisks) {
        source = new LinkedListStack<>();
        auxiliary = new LinkedListStack<>();
        destination = new LinkedListStack<>();

        for (int i = numberOfDisks; i > 0; i--) {
            source.push(i);
        }
    }

    public void solve() {
        printTowers();
        moveDisks(source.size(), source, destination, auxiliary);
    }

    private void moveDisks(int n, LinkedListStack<Integer> source, LinkedListStack<Integer> destination, LinkedListStack<Integer> auxiliary) {
        if (n > 0) {
            moveDisks(n - 1, source, auxiliary, destination);
            destination.push(source.pop());
            printTowers();
            moveDisks(n - 1, auxiliary, destination, source);
        }
    }

    private void printTowers() {
        System.out.print("Source Stack: ");
        printStackInReverse(source);
        System.out.print("Auxiliary Stack: ");
        printStackInReverse(auxiliary);
        System.out.print("Destination Stack: ");
        printStackInReverse(destination);
        System.out.println();
    }

    public void printStackInReverse(LinkedListStack<Integer> stack) {
        printStackInReverseHelper(stack);
        System.out.println();
    }

    private void printStackInReverseHelper(LinkedListStack<Integer> stack) {
        if (!stack.isEmpty()) {
            Integer item = stack.pop();
            printStackInReverseHelper(stack);
            System.out.print(item + " ");
            stack.push(item); // Restore the stack after printing the item
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int numberOfDisks = scanner.nextInt();

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi(numberOfDisks);
        towerOfHanoi.solve();
    }
}
