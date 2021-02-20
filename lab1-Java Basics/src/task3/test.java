package task3;

import task2.Student;

public class test {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();

        st1.setName("Ana");
        st1.setYear(1990);
        st2.setName("Ana");
        st2.setYear(1990);


        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
    }
}
