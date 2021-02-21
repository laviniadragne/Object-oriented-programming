package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // task 1 si 2
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Mircea", "Popescu", 178L, 9.82);
        Student s2 = new Student("Mircea", "Ionescu", 17854L, 9.50);
        Student s3 = new Student("Alex", "Vasilescu", 145L, 10.0);
        Student s4 = new Student("Bogdan", "Vasile", 945L, 8.25);
        Student s5 = new Student("Miruna", "Simionescu", 543L, 10.0);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.toString());
        }
        System.out.println("\n");

        // task 3
        students.sort((o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        for (Student s : students) {
            System.out.println(s.toString());
        }
        System.out.println("\n");

        // task 4
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
        pq.addAll(students);
        while (pq.size() != 0) {
            System.out.println(pq.poll());
        }
        System.out.println();

        // task 6
        HashMap<Student, LinkedList<String>> map = new HashMap<>();
        LinkedList<String> subjects1 = new LinkedList<>();
        subjects1.add("Biologie");
        subjects1.add("Chimie");
        subjects1.add("Fizica");

        LinkedList<String> subjects2 = new LinkedList<>();
        subjects2.add("Mate");
        subjects2.add("Electronica");
        subjects2.add("Programare");

        LinkedList<String> subjects3 = new LinkedList<>();
        subjects3.add("Desen");
        subjects3.add("Chimie");

        LinkedList<String> subjects4 = new LinkedList<>();
        subjects4.add("Sport");
        subjects4.add("Engleza");
        subjects4.add("Franceza");

        LinkedList<String> subjects5 = new LinkedList<>();
        subjects5.add("Geografie");
        subjects5.add("Istorie");

        map.put(s1, subjects1);
        map.put(s2, subjects2);
        map.put(s3, subjects3);
        map.put(s4, subjects4);
        map.put(s5, subjects5);

        for (Map.Entry<Student, LinkedList<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurname() +
                    " are urmatoarele materii preferate: " + entry.getValue().toString());
        }
        System.out.println();

        // task 7
        // cu LinkedHashSet
        Number numbers = new Number();
        for (Integer i = 20; i >= 0; i--) {
            numbers.add(i);
        }
        System.out.println("Numerele din clasa care extinde LinkedHashSet sunt:");
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // => Cu LinkedHashSet se pastreaza ordinea de inserare

        // cu HashSet, in loc de LinkedHashSet
        NumberSet numberSet = new NumberSet();
        for (Integer i = 20; i >= 0; i--) {
            numberSet.add(i);
        }
        System.out.println("Numerele din clasa care extinde HashSet sunt:");
        Iterator<Integer> newIt = numberSet.iterator();
        while(newIt.hasNext()){
            System.out.println(newIt.next());
        }
        // => Cu HashSet nu se pastreaza ordinea de inserare

        // cu TreeSet
        NumberTree numbersTree = new NumberTree();
        for (Integer i = 20; i >= 0; i--) {
            numbersTree.add(i);
        }
        System.out.println("Numerele din clasa care extinde TreeSet sunt:");
        Iterator<Integer> it2 = numbersTree.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        // => Cu TreeSet numerele sunt ordonate crescator


    }
}
