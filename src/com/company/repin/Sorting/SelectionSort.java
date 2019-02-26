package com.company.repin.Sorting;

import static com.company.repin.Sorting.UtilClassSort.swap;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);

        int tempIndex;
        for (int i = 0; i < resultArray.length - 1; i++) {
            tempIndex = i;
            for (int j = i + 1; j < resultArray.length; j++) {
                if (resultArray[j] < resultArray[tempIndex])
                    tempIndex = j;
            }
            swap(resultArray, i, tempIndex);
        }
        return resultArray;
    }
}
