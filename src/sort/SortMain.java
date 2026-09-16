package sort;

import sort.basic.BubbleSort;
import sort.basic.InsertionSort;
import sort.basic.SelectionSort;
import sort.common.MySorter;

import static sort.common.MyList.print;

public class SortMain {
    public static void main(String[] args) {
        Integer[] intList = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

//      SelectionSort<Integer> sorter = new SelectionSort<>();
        MySorter<Integer> sorter = new BubbleSort<>();
        sorter.sort(intList);

        print(intList);

        Double[] doubleList = {8.0, 31.0, 48.0, 73.0, 3.0, 65.0, 20.0, 29.0, 11.0, 15.0};

        MySorter<Double> doubleSorter = new SelectionSort<>();
        doubleSorter.sort(doubleList);

        print(doubleList);

        String[] stringList = {"8", "31", "48", "73", "3", "65", "20", "29", "11", "15"};

        MySorter<String> stringSorter = new SelectionSort<>();
        stringSorter.sort(stringList);

        print(stringList);

        Integer[] insertsList = {9, 8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

//      SelectionSort<Integer> sorter = new SelectionSort<>();
        MySorter<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(intList);

        print(intList);
    }


}
