package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class EmployeePayrollAnalysisTest {

    @Test
    void givenFile_whenRead_shouldReturnCorrectData() throws Exception {

        EmployeePayrollService service = new EmployeePayrollService();

        service.list.add(new EmployeePayrollData(1, "Nandha", 50000));
        service.list.add(new EmployeePayrollData(2, "Kumar", 60000));

        // write to file
        service.writeToFile();

        // read file
        List<String> data = service.readFile();

        // verify
        assertEquals(2, data.size());
        assertTrue(data.get(0).contains("Nandha"));
    }
}