package lesson8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    String name;
    String phone;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Student(String name, String phone){
        this.name = name;
        this.phone = phone;

        Set<Student>students = new HashSet<>();
        students.add(new Student("Kirill", "12234"));
        students.add(new Student("Elon", "1234"));
        students.add(new Student("Ed", "12274"));
        students.add(new Student("Edd", "12294"));
        students.add(new Student("Sandra", "1274"));
        for (Student student: students) {
            System.out.println("student = " + student);

        }

    }
}
