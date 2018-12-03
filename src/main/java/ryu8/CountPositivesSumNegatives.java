package ryu8;

import java.util.Arrays;

public class CountPositivesSumNegatives {

    private final static boolean JAVA_8_SOLUTION = true;

    public static int[] countPositivesSumNegatives(int[] input) {
        return JAVA_8_SOLUTION ? j8CountPositivesSumNegatives(input) : j7countPositivesSumNegatives(input);
    }

    private static int[] j7countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int positivesCount = 0;
        int negativesSum = 0;
        for (int element : input) {
            if (element > 0) positivesCount++;
            else negativesSum += element;
        }
        return new int[] {positivesCount, negativesSum};
    }

    private static int[] j8CountPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int positivesCount = (int) Arrays.stream(input).filter(e -> e > 0).count();
        int negativesSum = Arrays.stream(input).filter(e -> e < 0).sum();
        return new int[] {positivesCount, negativesSum};
    }

}
