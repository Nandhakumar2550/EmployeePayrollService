package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

public class EmployeePayrollReadTest {

    @Test
    void givenFile_whenRead_shouldReturnCorrectCount() throws IOException {

        EmployeePayrollService service = new EmployeePayrollService();

        service.addEmployee(1, "Nandha", 50000);
        service.addEmployee(2, "Kumar", 60000);

        String fileName = "employees.txt";

        service.writeToFile(fileName);

        List<String> data = service.readFromFile(fileName);

        assertEquals(2, data.size());
    }
}