package ryu8;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class MergeSortedArraysTest {

    @Test
    public void basicTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergeSortedArrays.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergeSortedArrays.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }

}