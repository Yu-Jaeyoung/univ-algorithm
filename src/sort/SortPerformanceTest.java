package sort;

import sort.basic.BubbleSort;
import sort.basic.InsertionSort;
import sort.basic.SelectionSort;
import sort.common.MyList;
import sort.common.MySorter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortPerformanceTest {
    static final int SIZE = 10_000;

    public static void main(String[] args) {
        Integer[] list = getList();

        List<MySorter<Integer>> sorters = Arrays.asList(
                new SelectionSort<>(),
                new BubbleSort<>(),
                new InsertionSort<>()
        );

        for (MySorter<Integer> sorter : sorters) {
            Integer[] copyList = Arrays.copyOf(list, list.length);
            measureTime(sorter, copyList);

            // MyList.print(copyList, 10);
        }


        measureTime(new SelectionSort<>(), list);
        measureTime(new SelectionSort<>(), list);
    }

    private static Integer[] getList() {
        Integer[] list = new Integer[SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            list[i] = random.nextInt(100_000);
        }
        return list;
    }

    private static <E> void measureTime(MySorter<E> sorter, E[] list) {
        long startTime = System.nanoTime();
        sorter.sort(list);
        long endTime = System.nanoTime();
        System.out.printf("%20s 실행 시간: %10.2f msec%n", sorter.getClass().getSimpleName(), (endTime - startTime) / 1000_000.0);
    }
}
