package com.srm.algolib.sorting;

public class BubbleSort {

    private static void exchange(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void sort(int[] a) {
        if (a==null) return;
        if (a.length < 2) return;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i<a.length-1;i++) {
                if (a[i] > a[i+1]) {
                    exchange (a,i,i+1);
                    swapped = true;
                }
            }
        }while (swapped);
    }
}
