package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeePayrollTest {

    @Test
    void givenEmployees_whenCounted_shouldReturnCorrectCount() {

        EmployeePayrollService service = new EmployeePayrollService();

        service.list.add(new EmployeePayrollData(1, "A", 1000));
        service.list.add(new EmployeePayrollData(2, "B", 2000));


        assertEquals(1, service.list.size());
    }
}

