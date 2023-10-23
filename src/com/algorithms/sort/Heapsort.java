package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see https://en.wikipedia.org/wiki/Heapsort
 */

public class Heapsort {

    private static int leftChild(int index) {
        return (index << 1) | 1;
    }

    private static int rightChild(int index) {
        return (index << 1) + 2;
    }

    private static void swap(int[] array, int i, int j) {
        array[i] = (array[i] ^ array[j]) ^ (array[j] = array[i]);
    }

    private static void maxHeapify(int[] array, int index, int heapsize) {
        int left = leftChild(index), right = rightChild(index);
        int largest = index;

        if (left < heapsize && array[left] > array[largest]) {
            largest = left;
        }
        if (right < heapsize && array[right] > array[largest]) {
            largest = right;
        }

        if (array[largest] > array[index]) {
            swap(array, index, largest);
            maxHeapify(array, largest, heapsize);
        }
    }

    private static void buildMaxHeap(int[] array) {
        for (int i = (array.length >> 1) - 1; i >= 0; i--) {
            maxHeapify(array, i, array.length);
        }
    }

    /**
     * Sorts an array of integers in increasing order using heapsort algorithm.
     *
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        buildMaxHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            maxHeapify(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
