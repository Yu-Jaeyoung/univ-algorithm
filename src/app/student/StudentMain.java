package app.student;

import sort.basic.InsertionSort;
import sort.common.MyList;
import sort.common.MySorter;

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
    }
}
