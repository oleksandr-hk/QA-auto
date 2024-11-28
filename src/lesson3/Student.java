package lesson3;

import java.util.Objects;

public class Student implements Cloneable{
    public String name;
    private long id;
    private double gpa;

    public Student() {
    }

    public Student(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
