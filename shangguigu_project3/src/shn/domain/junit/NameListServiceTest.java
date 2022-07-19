package shn.domain.junit;

import org.testng.annotations.Test;
import shn.domain.Employee;
import shn.service.NameListService;

public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service=new NameListService();
        Employee[] employees=service.getAllEmployees();
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
}
