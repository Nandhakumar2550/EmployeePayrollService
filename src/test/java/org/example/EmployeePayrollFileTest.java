package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.*;
import java.io.IOException;

public class EmployeePayrollFileTest {

    @Test
    void givenEmployees_whenWrittenToFile_shouldCreateFile() throws Exception {

        EmployeePayrollService service = new EmployeePayrollService();

        // adding employee data
        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));

        // write to file
        service.writeToFile();

        Path path = Paths.get("payroll.txt"); // file path

        // check file exists
        assertTrue(Files.exists(path));

        // check number of lines
        long count = Files.lines(path).count();

        assertEquals(2, count); // verify count
    }
}