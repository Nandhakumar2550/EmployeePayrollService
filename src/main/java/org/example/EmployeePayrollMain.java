package org.example;

import java.util.*;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeePayrollService service = new EmployeePayrollService();

        service.readEmployeeData(sc);
        service.writeEmployeeData();

        sc.close();
    }
}