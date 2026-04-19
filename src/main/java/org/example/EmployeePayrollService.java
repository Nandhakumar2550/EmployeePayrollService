package org.example;

import java.util.*;

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

        list.add(new EmployeePayrollData(id, name, salary));
    }

    // UC1 → Write to console
    public void writeEmployeeData() {

        System.out.println("\nEmployee Data:");

        for (EmployeePayrollData e : list) {
            System.out.println(e);
        }
    }
}