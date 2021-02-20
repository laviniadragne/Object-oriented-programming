package task2;

import java.util.ArrayList;

public class Course {
    String title;
    String description;
    Student[] students;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public ArrayList<Student> filterYear(int year) {
        ArrayList<Student> s = new ArrayList<>();
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].year == year) {
                s.add(this.students[i]);
            }

        }
        return s;
    }
}
