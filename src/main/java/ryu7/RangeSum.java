package ryu7;

public class RangeSum {

    public int getSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int sumEdges = a + b;
        int elementCount = Math.abs(a - b) + 1;
        return sumEdges * elementCount / 2;
    }

}
