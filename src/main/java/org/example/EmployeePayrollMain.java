package org.example;

import java.util.*;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        EmployeePayrollService service = new EmployeePayrollService();

        service.readEmployeeData(scan);
        service.writeEmployeeData();

        scan.close();
    }
}