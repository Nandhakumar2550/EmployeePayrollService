package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.*;
import java.io.IOException;

public class EmployeePayrollFileTest {

    @Test
    void givenEmployees_whenWrittenToFile_shouldCreateFile() throws IOException {

        EmployeePayrollService service = new EmployeePayrollService();

        // ✅ correct way (NO addEmployee)
        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));

        // ✅ correct method (NO parameter)
        service.writeToFile();

        Path path = Paths.get("payroll.txt");

        // check file exists
        assertTrue(Files.exists(path));

        // check number of lines
        long count = Files.lines(path).count();

        assertEquals(2, count);
    }
}