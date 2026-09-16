package sort.common;

public class MyList {
    public static <E> void print(E[] list, int count) {
        for (int i = 0; i < list.length && i < count; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }


    public static <E> void print(E[] list) {
        for (E value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static <E> void println(E[] list) {
        for (E value : list) {
            System.out.println(value);
        }
    }

    public static <E> void swap(E[] list, int i, int j) {
        E tmp = list[i];
        list[i] = list[j];
        list[j] = tmp;
    }
}

