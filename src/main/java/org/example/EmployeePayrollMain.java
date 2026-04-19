package org.example;

import java.util.*;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeePayrollService service = new EmployeePayrollService();

<<<<<<< HEAD
        service.readEmployeeData(sc);
        service.writeEmployeeData();

        sc.close();
=======
        service.readEmployeeData(scan);
        service.writeEmployeeData();

        System.out.println("Total Employees: " + service.countEntries());

        scan.close();
>>>>>>> feature/UC3-WatchService
    }
}