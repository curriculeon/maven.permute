package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T> - type of collection
     * @return array with contents identical to `collection`
     */
    public static  <T> T[] toArray(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection);
        T[] toR = (T[]) new Object[collection.size()];
        for (int i = 0; i < list.size(); i++) {
            toR[i] = list.get(i);
        }
        return toR;
    }
}

