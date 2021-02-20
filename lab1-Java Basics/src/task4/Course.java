package task4;

import java.util.ArrayList;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public Student[] getStudents() {

        return students;
    }

    public void setStudents(Student[] students) {

        this.students = students;
    }

    public ArrayList<Student> filterYear(int year) {
        ArrayList<Student> s = new ArrayList<>();
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getYear() == year) {
                s.add(this.students[i]);
            }

        }
        return s;
    }
}
