package rocks.zipcode.io.powerset;

import org.junit.Assert;
import rocks.zipcode.io.collections.PowerSet;

import java.util.*;

public class PowerSetTestUtilities {
    public static <E> void test(E[] input, List<E>... expectedSetArray) {
        // given
        PowerSet<E> powerset = new PowerSet<>(input);
        Set<Set<E>> expectedSets = new LinkedHashSet<>();
        Arrays.asList(expectedSetArray).forEach(list -> expectedSets.add(new LinkedHashSet<>(list)));

        // when
        Set<Set<E>> actualSet = powerset.permute();

        // then
        actualSet.forEach(set -> Assert.assertTrue(contains(expectedSets, set)));
        expectedSets.forEach(set -> Assert.assertTrue(contains(actualSet, set)));
    }

    public static boolean contains(Collection<? extends Collection<?>> nestedCollection, Collection<?> collection) {
        for (Collection<?> subCollection : nestedCollection) {
            if (subCollection.containsAll(collection)) {
                return true;
            }
        }
        return false;
    }
}
