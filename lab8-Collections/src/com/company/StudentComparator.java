package com.company;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
       return Long.compare(s1.getId(), s2.getId());
    }
}

