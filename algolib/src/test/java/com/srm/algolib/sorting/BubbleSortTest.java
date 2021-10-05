package com.srm.algolib.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSortIntegers() {
        int[] a = {5,-2,3,6,7,12};
        BubbleSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-2,3,5,6,7,12},a);
    }

    @Test
    public void testSortIntegersTrivial() {
        int[] a = {5};
        BubbleSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{5},a);
    }

    @Test
    public void testSortIntegers2() {
        int[] a = {5,-2};
        BubbleSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-2,5},a);
    }

    @Test
    public void testSortIntegersdup() {
        int[] a = {2,1,1,2,2,1,3};
        BubbleSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{1,1,1,2,2,2,3},a);
    }

        private boolean isSorted(int[] a) {
        for (int i=0;i<a.length-1;i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
}