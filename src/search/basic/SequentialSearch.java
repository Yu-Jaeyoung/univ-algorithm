package search.basic;

import search.common.MySearcher;

import java.util.Comparator;

public class SequentialSearch<E extends Comparable<E>> implements MySearcher<E> {
    @Override
    public int search(E[] list, E target) {
        return search(list, target, Comparable::compareTo);
    }

    @Override
    public int search(E[] list, E target, Comparator<E> comparator) {
        for (int i = 0; i < list.length; i++) {
            int result = comparator.compare(target, list[i]);

            if (result == 0) {
                return i;
            }
        }
        return -1;
    }
}
