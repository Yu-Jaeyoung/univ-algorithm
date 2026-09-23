package search.basic;

import search.common.MySearcher;

import java.util.Comparator;

public class RecursiveBinarySearch<E extends Comparable<E>> implements MySearcher<E> {
    @Override
    public int search(E[] list, E target) {
        return binarySearch(list, 0, list.length - 1, target);
    }

    @Override
    public int search(E[] list, E key, Comparator<E> comparator) {
        return binarySearch(list, 0, list.length - 1, key, comparator);
    }

    private int binarySearch(E[] list, int low, int high, E target) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (list[mid].equals(target)) {
            return mid;
        } else if (target.compareTo(list[mid]) < 0) {
            return binarySearch(list, low, mid - 1, target);
        } else {
            return binarySearch(list, mid + 1, high, target);
        }
    }

    private int binarySearch(E[] list, int low, int high, E key, Comparator<E> comparator) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        int result = comparator.compare(key, list[mid]);

        if (result == 0) {
            return mid;
        } else if (result < 0) {
            return binarySearch(list, low, mid - 1, key);
        } else {
            return binarySearch(list, mid + 1, high, key);
        }
    }

}
