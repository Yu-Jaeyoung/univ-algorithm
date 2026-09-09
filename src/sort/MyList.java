package sort;

public class MyList {
    public static <E> void print(E[] list) {
        for (E value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static <E> void swap(E[] list, int i, int j) {
        E tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }
}

