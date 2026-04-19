package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.*;

public class EmployeePayrollFileTest {

    @Test
    void givenEmployees_whenWrittenToFile_shouldCreateFile() throws Exception {

        EmployeePayrollService service = new EmployeePayrollService();

        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));

        service.writeToFile();

        Path file = Paths.get("payroll.txt");

        // file exists check
        assertTrue(Files.exists(file));

        // file line count check
        long lines = Files.lines(file).count();

        assertEquals(2, lines);
    }
}