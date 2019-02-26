package com.company.repin.sorting;

public class BucketSort {
    public static int[] sortBucket(int[] array) {
        int[] resultArray = new int[array.length];
        System.arraycopy(array, 0, resultArray, 0, array.length);

        int maxElement = getMaxElement(resultArray);
        int[] bucket = new int[maxElement + 1];

        for (int i = 0; i < resultArray.length; i++) {
            bucket[resultArray[i]]++;
        }

        int counterPosition = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                resultArray[counterPosition++] = i;
            }
        }
        return resultArray;
    }

    private static int getMaxElement(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
