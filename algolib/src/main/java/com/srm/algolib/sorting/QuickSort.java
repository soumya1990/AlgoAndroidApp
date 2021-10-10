package com.srm.algolib.sorting;

public final class QuickSort {
    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int l, int h) {
        if (l >= h) return;
        Pair<Integer, Integer> v = partitionEq(a, l, h);
        quickSort(a, l, v.k);
        quickSort(a, v.v, h);
    }

    private static void exchange(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;

    }

    private static Pair<Integer, Integer> partition(int[] a, int l, int h) {
        int gt = l + 1;
        for (int i = l + 1; i <= h; i++) {
            if (a[i] < a[l]) {
                exchange(a, gt, i);
                gt++;
            }
        }
        exchange(a, l, gt - 1);
        return new Pair<>(0, gt - 1);

    }

    private static Pair<Integer, Integer> partitionEq(int[] a, int l, int h) {
        int gt = l + 1;
        int lt = l;
        for (int i = l + 1; i <= h; i++) {
            if (a[i] < a[l]) {
                exchange(a, i, gt);
                exchange(a, ++lt, gt);
                gt++;
            } else if (a[i] == a[l]) {
                exchange(a, i, gt);
            }
        }
        exchange(a, lt, l);
        return new Pair<>(lt - 1, gt);
    }

    private static class Pair<K, V> {
        K k;
        V v;

        Pair(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
}
