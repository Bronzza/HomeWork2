package com.company.repin.sorting;

public class RadixSort {
    public static int[] radixSort(int arr[]) {
        int[] resultArray = new int[arr.length];
        System.arraycopy(arr, 0, resultArray, 0, arr.length);

        final int radix = String.valueOf(Integer.MAX_VALUE).length();
        int digitPlace = 1;
        int n = resultArray.length;
        int result[] = new int[n];

        int largestNum = getMax(resultArray);


        int count[] = new int[radix];
        while (largestNum / digitPlace > 0) {
            for (int i = 0; i < radix; i++) {
                count[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                int tmpIndex = Math.abs((resultArray[i] / digitPlace) % radix);
                count[tmpIndex]++;
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                int tmpIndex = Math.abs((resultArray[i] / digitPlace) % radix);
                result[count[tmpIndex] - 1] = resultArray[i];
                count[tmpIndex]--;
            }
            for (int i = 0; i < n; i++) {
                resultArray[i] = result[i];
            }
            digitPlace *= 10;
        }
        return resultArray;
    }

    private static int getMax(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
