package com.company.repin.Sorting;

public class InsertSort {
    public static int[] insertSort(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);

        int j;
        for (int gap = resultArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < resultArray.length; i++) {
                int temp = resultArray[i];
                for (j = i; j >= gap && resultArray[j - gap] > temp; j -= gap) {
                    resultArray[j] = resultArray[j - gap];
                }
                resultArray[j] = temp;
            }
        }
        return resultArray;
    }
}
