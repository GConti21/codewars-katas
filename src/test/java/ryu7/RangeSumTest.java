package ryu7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RangeSumTest {

    RangeSum rangeSum = new RangeSum();

    @Test
    public void test1() {
        assertEquals(rangeSum.getSum(0, -1), -1);
        assertEquals(rangeSum.getSum(0, 1), 1);
    }

    @Test
    void testBothNegative() {
        assertEquals(rangeSum.getSum(-3, -5), -12);
    }

    @Test
    void testBothPositive() {
        assertEquals(rangeSum.getSum(4, 7), 22);
    }

    @Test
    void testOneNegativeOtherPositive() {
        assertEquals(rangeSum.getSum(-3, 1), -5);
    }

    @Test
    void testPair() {
        assertEquals(rangeSum.getSum(-9, -8), -17);
    }

    @Test
    void testThree() {
        assertEquals(rangeSum.getSum(-9, -7), -24);
    }

}