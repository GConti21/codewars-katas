package ryu8;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthDiff {

    public static int mxdiflg(String[] array1, String[] array2) {
        if (isEmpty(array1) || isEmpty(array2)) return -1;

        int minArray1 = getMin(array1);
        int maxArray1 = getMax(array1);

        int minArray2 = getMin(array2);
        int maxArray2 = getMax(array2);

        int diff1 = Math.abs(maxArray1 - minArray2);
        int diff2 = Math.abs(minArray1 - maxArray2);

        return Math.max(diff1, diff2);
    }

    private static boolean isEmpty(String[] array) {
        return array == null || array.length == 0;
    }

    private static int getMin(String[] array) {
        return Arrays.stream(array).map(String::length).min(Comparator.naturalOrder()).orElse(0);
    }

    private static int getMax(String[] array) {
        return Arrays.stream(array).map(String::length).max(Comparator.naturalOrder()).orElse(0);
    }

}
