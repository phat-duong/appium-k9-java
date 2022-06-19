package lab_09;

import java.util.ArrayList;
import java.util.List;

public class Main extends SalaryController {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee_1 = new FullTimeEmployee();
        Employee employee_2 = new FullTimeEmployee();
        Employee employee_3 = new FullTimeEmployee();
        Employee employee_4 = new ContractEmployee();
        Employee employee_5 = new ContractEmployee();

        employeeList.add(employee_1);
        employeeList.add(employee_2);
        employeeList.add(employee_3);
        employeeList.add(employee_4);
        employeeList.add(employee_5);

        SalaryController salaryController = new SalaryController();
        System.out.println("Total salary is: " + salaryController.getTotalSalary(employeeList));
    }
}



