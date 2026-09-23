package app.student;

import search.basic.IterBinarySearch;
import search.basic.SequentialSearch;
import search.common.MySearcher;
import sort.basic.InsertionSort;
import sort.common.MyList;
import sort.common.MySorter;

import java.util.Comparator;

import static sort.common.MyList.*;

public class StudentMain {
    static void main() {
        Student[] studentList = {
                new Student("Alice", 30, 1, 4.5),
                new Student("Bob", 25, 2, 4.3),
                new Student("Charlie", 26, 3, 4.2),
                new Student("Danial", 24, 5, 3.1),
                new Student("Ethan", 27, 6, 3.0),
                new Student("Father", 23, 10, 3.7),
                new Student("Guarder", 21, 9, 2.8),
                new Student("Harry", 22, 4, 4.1),
                new Student("Irish", 25, 8, 4.3),
                new Student("Jay", 27, 7, 4.4)
        };

        MySorter<Student> sorter = new InsertionSort<>();
        sorter.sort(studentList);
        println(studentList);

        MySearcher<Student> searcher = new IterBinarySearch<>();

        Comparator<Student> comparator =
                Comparator.comparing(Student::name);

        Student student = new Student("Harry", 22, 4, 4.1);

        int index = searcher.search(studentList, student, comparator);

        if (index < 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println(index + " 위치에 있습니다.");
        }
    }
}
