package com.algorithms.sort;

import java.util.Arrays;

/**
 * @see https://en.wikipedia.org/wiki/Merge_sort
 */

public class MergeSort {

    /**
     * Sorts an array of integers in non-decreasing order using merge sort
     * algorithm.
     * 
     * @param array The array of integers to be sorted.
     */

    public static void sort(int[] array) {
        if (array.length == 1) {
            return;
        }

        int mid = array.length >> 1;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - mid] = array[i];
            }
        }

        sort(leftArray);
        sort(rightArray);
        merge(array, leftArray, rightArray);
    }

    /**
     * Merges two sorted array of integers to a single sorted array.
     * 
     * @param array      The array into which to merge the two sorted arrays.
     * @param leftArray  The left sorted array.
     * @param rightArray The right sorted array.
     */

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        for (int k = 0, l = 0, r = 0; k < array.length; k++) {
            if (l < leftArray.length && r < rightArray.length) {
                if (leftArray[l] <= rightArray[r]) {
                    array[k] = leftArray[l++];
                } else {
                    array[k] = rightArray[r++];
                }
            } else if (l < leftArray.length) {
                array[k] = leftArray[l++];
            } else {
                array[k] = rightArray[r++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 1, 4, 2, 0, 7, 8, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
