package sort.common;

import java.util.Comparator;

public interface MySorter<E> {
    void sort(E[] list);

    void sort(E[] list, Comparator<E> comparator);
}
