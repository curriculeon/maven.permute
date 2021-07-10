package rocks.zipcode.io.arrays.arrayutils;

import org.junit.Test;
import rocks.zipcode.io.arrays.IntegerArrayUtils;
import rocks.zipcode.io.TestUtilities;

/**
 * @author leon on 24/01/2019.
 */
public class GetRangeTest {
    @Test
    public void test1() {
        Integer start = 0;
        Integer end = 10;
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] actual = IntegerArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Integer start = 5;
        Integer end = 10;
        Integer[] expected = {5, 6, 7, 8, 9, 10};
        Integer[] actual = IntegerArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Integer start = -10;
        Integer end = 0;
        Integer[] expected = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        Integer[] actual = IntegerArrayUtils.getRange(start, end);
        TestUtilities.assertArrayEquals(expected, actual);
    }
}