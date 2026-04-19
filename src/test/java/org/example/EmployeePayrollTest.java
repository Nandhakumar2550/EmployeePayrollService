package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeePayrollTest {

    @Test
    void givenEmployees_whenAdded_shouldMatchCount() {

        EmployeePayrollService service = new EmployeePayrollService();

        service.addEmployee(1, "Nandha", 50000);
        service.addEmployee(2, "Kumar", 60000);

        int count = service.countEntries();

        assertEquals(2, count);
    }
}