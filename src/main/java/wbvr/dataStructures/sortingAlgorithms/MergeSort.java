package wbvr.dataStructures.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public void run(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(mergeSort(arr)));
    }

    public int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);

        if (arr.length - middle >= 0) {
            System.arraycopy(arr, middle, right, 0, arr.length - middle);
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
