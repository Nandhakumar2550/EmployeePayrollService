package org.example;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

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

    // 🔥 UC4 NEW METHOD
    public void writeToFile() throws IOException {

        List<String> lines = new ArrayList<>();

        for (EmployeePayrollData e : list) {
            lines.add(e.toString());
        }

        Files.write(Paths.get("payroll.txt"), lines);
    }
}