package com.poo.lab12.reports;

import java.util.*;
import java.util.stream.Collectors;

import com.poo.lab12.entities.Business;
import com.poo.lab12.entities.Disability;
import com.poo.lab12.entities.Employee;
import com.poo.lab12.entities.Gender;
import com.poo.lab12.entities.Project;
import com.poo.lab12.entities.Religion;

public class BusinessReport {

    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {

        return business.getEmployees()
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDisability));
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count


        return 0;
    }

    public static SortedSet<Employee> getEmployeesMaxByReligionMinByGenderSortedByCitySortedByAge(Business business) {
        // Get the employees with majority by religion, from this group select the subgroup that has the minority by gender
        // Sort the set by city and, in case of equality, by age

        List<Employee> employees = new ArrayList<>(business.getEmployees());

        // Map cu lista de angajati ca si value si key religia acelor angajati
        Map<Religion, List<Employee>> employeesByReligionMap = employees.stream()
                                                                        .collect(Collectors
                                                                                .groupingBy(Employee::getReligion));

        // Map cu key religia si value numarul de practicanti
        Map<Religion, Integer> maxReligionMap = employeesByReligionMap.entrySet()
                                                                      .stream()
                                                                      .collect(Collectors.toMap(Map.Entry::getKey,
                                                                              l -> l.getValue().size()));


        // Sortez map-ul pentru a gasi religia maxima si caut lista cu angajatii asignati acelei religii
        List<Employee> employeesByReligion = employeesByReligionMap.get(Collections.max(maxReligionMap.entrySet(),
                                                Comparator.comparingInt(Map.Entry::getValue)).getKey());

        // Impart lista obtinuta intr-un map cu key genul si valoarea o lista cu
        // angajatii cu acel gen
        Map<Gender, List<Employee>> genderMap = employeesByReligion.stream()
                                                                    .collect(Collectors.groupingBy(Employee::getGender));

        // Impart listele de femei si barbati intr-un map
        // cu key-ul genul si value numarul de employee din acel gen
        Map<Gender, Integer> employeeGenderMap = genderMap.entrySet()
                                                        .stream()
                                                        .collect(Collectors.toMap(Map.Entry::getKey,
                                                                l -> l.getValue().size()));

        // Gasesc genul cu cei mai putini employee
        // Caut in map-ul de mai sus lista de empployee ce reprezenta genul cel mai putin
        // numeros
        List<Employee> employeesByGender = genderMap.get(Collections.min(employeeGenderMap.entrySet(),
                                                Comparator.comparingInt(Map.Entry::getValue)).getKey());

        // Sortez lista obtinuta dupa oras si varsta, adaugand-o intr-un set
        TreeSet<Employee> sortedEmployees = new TreeSet<>(Comparator.comparing(Employee::getCity)
                                                                    .thenComparing(Employee::getAge));

        sortedEmployees.addAll(employeesByGender);

        return sortedEmployees;

    }

    public static Religion getReligionOfEmployeesWithMostAccounts(Business business) {

        List<Employee> employees = new ArrayList<>(business.getEmployees());

        // Map cu lista de angajati ca si value si key religia acelor angajati
        Map<Religion, List<Employee>> employeesByReligionMap = employees.stream()
                                                                        .collect(Collectors
                                                                                .groupingBy(Employee::getReligion));

        // Map cu key religia si value numarul de practicanti
        Map<Religion, Integer> maxReligionMap = employeesByReligionMap.entrySet()
                                                                      .stream()
                                                                      .collect(Collectors.toMap(Map.Entry::getKey,
                                                                        l -> l.getValue().size()));

        // Sortez map-ul pentru a gasi religia maxima
        return Collections.max(maxReligionMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

    }

    public static Map<Project, Map<String, List<Employee>>> getEmployeesOnSameProjectAndCity(Business business) {

        return null;
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {

       return business.getEmployees()
                      .stream()
                      .collect(Collectors.groupingBy(Employee::getReligion,
                        Collectors.groupingBy(Employee::getGender)));
    }
}
