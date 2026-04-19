package org.example;

import java.util.*;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner

        EmployeePayrollService service = new EmployeePayrollService();

        service.readEmployeeData(sc); // correct variable

        service.writeEmployeeData(); // display employees

        System.out.println("Total Employees: " + service.countEntries()); // print count

        sc.close(); // close scanner
    }
}