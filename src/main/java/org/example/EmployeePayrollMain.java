package org.example;

import java.util.Scanner;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        EmployeePayrollService service = new EmployeePayrollService();

        System.out.print("Enter Id: ");
        int id = scan.nextInt();

        System.out.print("Enter Name: ");
        String name = scan.next();

        System.out.print("Enter Salary: ");
        double salary = scan.nextDouble();

        service.addEmployee(id, name, salary);

        service.printData();

        System.out.println("Total Employees: " + service.countEntries());

        scan.close();
    }
}