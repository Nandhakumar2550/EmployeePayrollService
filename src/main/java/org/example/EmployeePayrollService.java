package org.example;

import java.util.*;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

    public void readEmployeeData(Scanner scan) {

        System.out.print("Enter Id: ");
        int id = scan.nextInt();

        System.out.print("Enter the Name: ");
        String name = scan.next();

        System.out.print("Enter the Salary: ");
        double salary = scan.nextDouble();

        list.add(new EmployeePayrollData(id, name, salary));
    }

    public void writeEmployeeData() {

        System.out.println("\nEmployee Payroll Data:");

        for (EmployeePayrollData data : list) {
            System.out.println(data);
        }
    }
}