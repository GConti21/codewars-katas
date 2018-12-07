package ryu8;

import java.util.Arrays;
import java.util.TreeSet;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] first, int[] second) {
        TreeSet<Integer> sorted = new TreeSet<>();
        Arrays.stream(first).forEach(sorted::add);
        Arrays.stream(second).forEach(sorted::add);
        Integer[] collect = sorted.toArray(new Integer[sorted.size()]);
        return Arrays.stream(collect).mapToInt(e -> e).toArray();
    }

}
