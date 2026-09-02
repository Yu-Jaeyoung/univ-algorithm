package algorithm.design;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();

        System.out.println("알고리즘 수행 시간: " + (endTime - startTime) / 1_000_000.0 + "ms");

    }
}
