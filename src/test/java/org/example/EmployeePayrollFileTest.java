package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.*;

public class EmployeePayrollFileTest {

    @Test
    void givenEmployees_whenWrittenToFile_shouldCreateFile() throws IOException {

        EmployeePayrollService service = new EmployeePayrollService();

        service.addEmployee(1, "Nandha", 50000);
        service.addEmployee(2, "Kumar", 60000);

        String fileName = "employees.txt";

        service.writeToFile(fileName);

        Path path = Paths.get(fileName);

        assertTrue(Files.exists(path));
    }
}