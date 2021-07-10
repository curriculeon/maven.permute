package rocks.zipcode.io.arrays;

/**
 * @author leon on 24/01/2019.
 */
public class IntegerArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end - value to stop counting
     * @return array of integers between `start` and `stop` incrementing by 1
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer delta = end - start;
        Integer[] result = new Integer[delta+1];
        for (int i = 0; i <= delta; i++) {
            result[i] = start + i;
        }
        return result;
    }
}
