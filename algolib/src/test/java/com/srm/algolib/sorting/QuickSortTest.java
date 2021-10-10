package com.srm.algolib.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testSortIntegers() {
        int[] a = {5,-2,3,6,7,12};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-2,3,5,6,7,12},a);
    }

    @Test
    public void testSortIntegersTrivial() {
        int[] a = {5};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{5},a);
    }

    @Test
    public void testSortIntegers2() {
        int[] a = {5,-2};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-2,5},a);
    }

    @Test
    public void testSortIntegersdup() {
        int[] a = {2,1,1,2,2,1,3};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{1,1,1,2,2,2,3},a);
    }
    @Test
    public void testSortIntegerNeg() {
        int[] a = {2,-2,3,-3};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-3,-2,2,3},a);
    }
    @Test
    public void testSortIntegerSorted() {
        int[] a = {2,3,4,5};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{2,3,4,5},a);
    }

    @Test
    public void testSortIntegerRSorted() {
        int[] a = {10,8,7,5,3,0,-1};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
        assertArrayEquals(new int[]{-1,0,3,5,7,8,10},a);
    }

    @Test
    public void testSortIntegerRandom() {
        int[] a = {100,2,32,1000,30,23,10,9,21,46,198,-267,100002,65};
        QuickSort.sort(a);
        assertTrue(isSorted(a));
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