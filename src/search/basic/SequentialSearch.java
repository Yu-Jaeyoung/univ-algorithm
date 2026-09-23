package search.basic;

import search.common.MySearcher;

import java.util.Comparator;

public class SequentialSearch<E> implements MySearcher<E> {
    @Override
    public int search(E[] list, E target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int search(E[] list, E key, Comparator<E> comparator) {
        for (int i = 0; i < list.length; i++) {
            int result = comparator.compare(key, list[i]);

            if (result == 0) {
                return i;
            }
        }
        return -1;
    }
}
