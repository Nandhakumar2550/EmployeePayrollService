package org.example;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

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

        System.out.println("\nEmployee Payroll Data :"); // consistent message

        for (EmployeePayrollData e : list) {
            System.out.println(e); // print each employee
        }
    }

    // UC3 → Count entries
    public int countEntries() {
        return list.size(); // return number of employees
    }

    // UC4 → Write to file
    public void writeToFile() throws IOException {

        List<String> lines = new ArrayList<>(); // create list of strings

        for (EmployeePayrollData e : list) {
            lines.add(e.toString()); // convert each employee to string
        }

        Files.write(Paths.get("payroll.txt"), lines); // write to file
    }
}