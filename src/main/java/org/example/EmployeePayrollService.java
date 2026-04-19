package org.example;

import java.util.*;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

    public void addEmployee(int id, String name, double salary) {
        list.add(new EmployeePayrollData(id, name, salary));
    }

    // UC3 → count entries
    public int countEntries() {
        return list.size();
    }

    public void printData() {
        for (EmployeePayrollData data : list) {
            System.out.println(data);
        }
    }
}