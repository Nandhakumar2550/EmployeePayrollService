package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeePayrollReadTest {

    @Test
    void givenEmployees_whenPrintedAndCounted_shouldMatch() throws Exception {

        EmployeePayrollService service = new EmployeePayrollService();

        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));

        // write to file
        service.writeToFile();

        // print (just to check visually)
        service.printFromFile();

        // count from file
        long count = service.countEntriesInFile();

        assertEquals(2, count);
    }
}