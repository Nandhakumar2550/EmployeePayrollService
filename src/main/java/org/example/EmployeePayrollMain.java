package org.example;

import java.util.Scanner;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        EmployeePayrollService service = new EmployeePayrollService();

        service.readEmployeeData(scan);
        service.writeEmployeeData();

        System.out.println("Total Employees: " + service.countEntries());

        scan.close();
    }
}