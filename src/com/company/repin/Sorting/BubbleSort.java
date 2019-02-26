package com.company.repin.Sorting;

import static com.company.repin.Sorting.UtilClassSort.swap;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int[] resultArray = new int[arr.length];
        System.arraycopy(arr, 0, resultArray, 0, arr.length);
        int n = resultArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (resultArray[j - 1] > resultArray[j]) {
                    swap(resultArray, j, j - 1);
                }
            }
        }
        return resultArray;
    }
}
