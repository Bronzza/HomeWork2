package com.company.repin;

import com.company.repin.Classes.ImmutableClass;
import com.company.repin.Classes.MyOuterClass;
import com.company.repin.Sorting.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CarRetailer carRetailer = new CarRetailer(new BmwCarBuilder());
        carRetailer.constructCar();
        Car myfirstCar = carRetailer.getCar();
        System.out.println(myfirstCar);

        ImmutableClass myImClass = new ImmutableClass("Vasia", 5);

        MyOuterClass myOuterClass = new MyOuterClass("first class");
        System.out.println(myOuterClass.getOuterName());
        myOuterClass.addRandomSymbol();
        System.out.println(myOuterClass.getOuterName());

        MyOuterClass.MyInner myInnerClass = myOuterClass.new MyInner();
        MyOuterClass.myNestedClass nested = new MyOuterClass.myNestedClass();

        int[] arr = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(201);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr)));
        System.out.println(Arrays.toString(RadixSort.radixSort(arr)));
        System.out.println(Arrays.toString(InsertSort.insertSort(arr)));
        System.out.println(Arrays.toString(HeapSort.sort(arr)));
        System.out.println(Arrays.toString(BucketSort.sortBucket(arr)));
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));

    }
}
