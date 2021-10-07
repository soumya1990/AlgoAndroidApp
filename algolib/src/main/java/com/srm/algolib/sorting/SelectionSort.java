package com.srm.algolib.sorting;

public class SelectionSort {
    private  static void exchange(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void sort (int[] a) {
        for (int i=0;i<a.length-1;i++) {
            int minIn = i;
            for (int j = i+1;j<a.length; j++) {
                if (a[j]<a[minIn]) {
                    minIn = j;
                }
            }
            exchange(a,i,minIn);
        }
    }
}
