package com.poo.lab12.reports;

import java.util.*;
import java.util.stream.Collectors;


import com.poo.lab12.entities.*;

public class BankReport {

    public static int getNumberOfCustomers(Bank bank) {
        // A customer is an Employee that works for a Business (client of the bank)

       return (int) bank.getClients()
                        .stream()
                        .mapToLong(aa->aa.getEmployees().size())
                        .sum();

    }

    public static long getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank

        return  bank.getClients()
                    .stream()
                    .flatMap(aa->aa.getEmployees().stream())
                    .mapToLong(bb->bb.getAccounts().size())
                    .sum();

    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order

        SortedSet<Employee> sortedEmployee = new TreeSet<>(Comparator.comparing(Employee::getName));

        bank.getClients().stream()
                         .map(Business::getEmployees)
                         .forEach(sortedEmployee::addAll);

        return sortedEmployee;

    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances

        return  bank.getClients().stream()
                                .flatMap(aa->aa.getEmployees().stream())
                                .flatMap(bb->bb.getAccounts().stream())
                                .mapToDouble(Account::getBalance)
                                .sum();

    }

    public static SortedSet getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance

        TreeSet<Account> accountsSortedBySum = new TreeSet<>(Comparator.comparing(Account::getBalance)
                                                .thenComparing(Account::getId));

        accountsSortedBySum.addAll(bank.getClients()
                            .stream()
                            .flatMap(business -> business.getEmployees().stream())
                            .flatMap(employee -> employee.getAccounts().stream())
                            .collect(Collectors.toSet()));


        return accountsSortedBySum;

    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts

        Map<Employee, Collection<Account>> customerAccountsMap = new HashMap<>();

        // Map cu key un Employee si value lista lui de Accounts
        bank.getClients()
                .forEach(e->e.getEmployees()
                .forEach(a->customerAccountsMap.put(a, a.getAccounts())));

        return customerAccountsMap;

    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities

        return bank.getClients()
                .stream()
                .flatMap(client -> client.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getCity));

    }

    public static Project getProjectWorkedOnByMostCustomers(Bank bank) {
        // Get all the projects from the employees and find the most repeated one in the list

        // Lista projects, lista employes
        // Parcurg lista de proiecte, pt fiecare proiect, parcurg lista
        // de employes.

        List<Employee> employeesList = new LinkedList<>();

        bank.getClients()
                .stream()
                .map(Business::getEmployees)
                .forEach(employeesList::addAll);

        Set<Project> projectsSet = bank.getClients()
                                    .stream()
                                    .flatMap(b -> b.getEmployees().stream())
                                    .flatMap(e -> e.getProjects().stream()).collect(Collectors.toSet());

        Map<Project, List<Employee>> employeesByProiects = new HashMap<>();

        projectsSet.forEach(c->employeesByProiects.put(c, employeesList .stream()
                    .filter(f->f.getProjects().contains(c)).collect(Collectors.toList())));

        Map<Project, Integer> projectsMap = employeesByProiects.entrySet()
                                        .stream()
                                        .collect(Collectors.toMap(Map.Entry::getKey, l->l.getValue().size()));

        return projectsMap.entrySet().stream().max((entry1, entry2)
                -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

    }

    public static Gender getGenderWhoWorkedOnMostProjects(Bank bank) {
        // Get all the pairs <gender, project> or <gender, List<project>>, then reduce the array to only one pair
        // of each gender and retrieve the one with most counted projects (you are expected to count duplicates as well).
        List<Employee> employees = new LinkedList<>();

        bank.getClients().stream()
                         .map(Business::getEmployees)
                         .forEach(employees::addAll);

        Map<Gender, List<Employee>> employeeMap = employees.stream()
                                                            .collect(Collectors.groupingBy(Employee::getGender));


        Map<Gender, Integer> gendreProjectsMap = employeeMap.entrySet()
                                                .stream()
                                                .collect(Collectors.toMap(Map.Entry::getKey,
                                                        list->list.getValue().stream()
                                                .mapToInt(e->e.getProjects().size())
                                                .sum()));

        if(gendreProjectsMap.get(Gender.MALE) > gendreProjectsMap.get(Gender.FEMALE)) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }

    }
}
