package org.example;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

    // UC1 → Read from console
    public void readEmployeeData(Scanner sc) {

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new EmployeePayrollData(id, name, salary)); // add employee
    }

    // UC1 → Write to console
    public void writeEmployeeData() {

        System.out.println("\nEmployee Payroll Data :");

        for (EmployeePayrollData e : list) {
            System.out.println(e); // print each employee
        }
    }

    // UC3 → Count entries
    public int countEntries() {
        return list.size();
    }

    // UC4 → Write to file
    public void writeToFile() throws IOException {

        List<String> lines = new ArrayList<>();

        for (EmployeePayrollData e : list) {
            lines.add(e.toString());
        }

        Files.write(Paths.get("payroll.txt"), lines);
    }

    // UC5 → Print file data
    public void printFromFile() throws IOException {

        System.out.println("\nData from File:");

        try (Stream<String> lines = Files.lines(Paths.get("payroll.txt"))) {
            lines.forEach(System.out::println);
        }
    }

    // UC5 → Count file entries
    public long countEntriesInFile() throws IOException {

        try (Stream<String> lines = Files.lines(Paths.get("payroll.txt"))) {
            return lines.count();
        }
    }
}