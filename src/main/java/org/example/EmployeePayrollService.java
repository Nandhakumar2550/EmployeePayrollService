package org.example;

import java.util.*;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

<<<<<<< HEAD
    // UC1 → Read from console
=======
>>>>>>> feature/UC3-WatchService
    public void readEmployeeData(Scanner sc) {

        System.out.print("Enter Id: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new EmployeePayrollData(id, name, salary));
    }

<<<<<<< HEAD
    // UC1 → Write to console
    public void writeEmployeeData() {

        System.out.println("\nEmployee Payroll Data :");

=======
    public void writeEmployeeData() {

        System.out.println("\nEmployee Data:");
>>>>>>> feature/UC3-WatchService

        for (EmployeePayrollData e : list) {
            System.out.println(e);
        }
    }
<<<<<<< HEAD
=======

    // 🔥 UC3 NEW METHOD
    public int countEntries() {
        return list.size();
    }
>>>>>>> feature/UC3-WatchService
}