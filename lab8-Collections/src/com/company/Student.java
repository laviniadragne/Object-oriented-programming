package com.company;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private Long id;
    private Double averageGrade;


    public Student(String name, String surname, Long id, Double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    // ii sortez descrescator dupa medie/prenume/nume
    @Override
    public int compareTo(Student o) {
        if (averageGrade == o.getAverageGrade()) {
            if (o.surname.equals(getSurname()))
                return o.name.compareTo(name);
            else
                return o.surname.compareTo(getSurname());
        } else {
            return o.averageGrade.compareTo(averageGrade);
        }
    }

    // task 5
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(id, student.id) && Objects.equals(averageGrade, student.averageGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, averageGrade);
    }
}
