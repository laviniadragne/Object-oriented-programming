package task2;


import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {

        Student st0 = new Student();
        st0.setName("Ana");
        st0.setYear(1990);

        Student st1 = new Student();
        st1.setName("Maria");
        st1.setYear(1995);

        Student st2 = new Student();
        st2.setName("Ioana");
        st2.setYear(2000);

        Student st3 = new Student();
        st3.setName("Mihai");
        st3.setYear(1997);

        Student[] st = new Student[4];


        st[0] = st0;
        st[1] = st1;
        st[2] = st2;
        st[3] = st3;

        Course cs = new Course();
        cs.setDescription("Interesant");
        cs.setStudents(st);
        cs.setTitle("POO");

        ArrayList<Student> stud;
        stud = cs.filterYear((Integer.parseInt(args[0])));
        System.out.println(stud.toString());
    }
}
