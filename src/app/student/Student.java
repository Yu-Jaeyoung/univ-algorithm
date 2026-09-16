package app.student;

public record Student(
        String name,
        int age,
        int number,
        double gpa
) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) {
            return Integer.compare(this.number, o.number);
        }
        return Integer.compare(this.age, o.age);
    }
}
