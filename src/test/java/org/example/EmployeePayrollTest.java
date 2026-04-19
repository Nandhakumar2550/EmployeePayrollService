package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeePayrollTest {

    @Test
    void givenEmployee_whenAdded_shouldMatchCount() {

        EmployeePayrollService service = new EmployeePayrollService();

        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));

        assertEquals(1, service.list.size());
    }
}
