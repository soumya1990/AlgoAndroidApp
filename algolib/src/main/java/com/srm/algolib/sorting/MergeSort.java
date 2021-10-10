package com.srm.algolib.sorting;

public class MergeSort {
    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        for (int i =0;i<aux.length;i++) {
            aux[i] = a[i];
        }
        mergeSort(a,0,a.length-1,aux);
    }
    private static void mergeSort(int[] a, int l, int h,int[] aux) {
        if (l>=h) return;
        int m = (l + h)/2;
        mergeSort(a,l,m,aux);
        mergeSort(a,m+1,h,aux);
        merge(a,l,m,h,aux);
    }
    private static void merge(int[] a, int l, int m, int h, int[] aux) {
        int i = l;
        int j = m+1;
        int k = l;
        while (i<=m && j <=h) {
            if (a[i] <= a[j]) {
                aux[k++] = a[i++];
            }else{
                aux[k++] = a[j++];
            }
        }
        while (i <= m) {
            aux[k++] = a[i++];
        }
        while (j <= h) {
            aux[k++] = a[j++];
        }
        for (i=0;i<a.length;i++) {
            a[i] = aux[i];
        }

    }

}
