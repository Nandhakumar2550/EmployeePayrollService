package org.example;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class EmployeePayrollService {

    List<EmployeePayrollData> list = new ArrayList<>();

    public void addEmployee(int id, String name, double salary) {
        list.add(new EmployeePayrollData(id, name, salary));
    }

    public int countEntries() {
        return list.size();
    }

    public void printData() {
        for (EmployeePayrollData data : list) {
            System.out.println(data);
        }
    }

    // UC4 → write to file
    public void writeToFile(String fileName) throws IOException {

        List<String> lines = new ArrayList<>();

        for (EmployeePayrollData e : list) {
            lines.add(e.toString());
        }

        Files.write(Paths.get(fileName), lines);
    }
}