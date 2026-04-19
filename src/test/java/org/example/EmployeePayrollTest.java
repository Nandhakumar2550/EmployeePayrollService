package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeePayrollTest {

    @Test
    void givenEmployees_whenCounted_shouldReturnCorrectCount() {

        EmployeePayrollService service = new EmployeePayrollService();

        // adding employee data
        service.list.add(new EmployeePayrollData(1, "Nandha", 50000)); // first employee
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));  // second employee

        assertEquals(2, service.list.size()); // verify count is 2
    }
}