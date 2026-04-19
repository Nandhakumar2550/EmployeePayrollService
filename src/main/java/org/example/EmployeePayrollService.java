package org.example;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

    public void readEmployeeData(Scanner sc) {

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new EmployeePayrollData(id, name, salary));
    }

    public void writeEmployeeData() {

        System.out.println("\nEmployee Data:");

        for (EmployeePayrollData e : list) {
            System.out.println(e);
        }
    }

    public int countEntries() {
        return list.size();
    }

    public void writeToFile() throws IOException {

        List<String> lines = new ArrayList<>();

        for (EmployeePayrollData e : list) {
            lines.add(e.toString());
        }

        Files.write(Paths.get("payroll.txt"), lines);
    }

    public void printFromFile() throws IOException {

        System.out.println("\nData from File:");

        try (Stream<String> lines = Files.lines(Paths.get("payroll.txt"))) {
            lines.forEach(System.out::println);
        }
    }

    public long countEntriesInFile() throws IOException {

        try (Stream<String> lines = Files.lines(Paths.get("payroll.txt"))) {
            return lines.count();
        }
    }

    // 🔥 UC6 NEW METHOD → read file for analysis
    public List<String> readFile() throws IOException {

        return Files.readAllLines(Paths.get("payroll.txt"));
    }
}