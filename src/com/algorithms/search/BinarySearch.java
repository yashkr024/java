package com.algorithms.search;

/**
 * @see https://en.wikipedia.org/wiki/Binary_search_algorithm
 */

public class BinarySearch {

    /**
     * Searches for the index of a target value in an array sorted in non-decreasing
     * order using binary search algorithm.
     * 
     * @param array The array of integers sorted in non-decreasing order.
     * @param value The value to search for in the input array.
     * @return The index of {@code value} if found, else -1
     */

    public static int search(int[] array, int value) {
        int left = 0, right = array.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) >> 1;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 1; i <= 1000; i++) {
            arr[i - 1] = i * 57;
        }

        int target = 5301;

        // int[] arr = { 1, 2, 4, 4, 4, 5, 6, 7 };
        // int target = 4;

        int index = search(arr, target);
        System.out.println(index);
    }

}
