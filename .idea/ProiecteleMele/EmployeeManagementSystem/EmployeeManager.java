package comGoogle.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        ContractEmployee contractEmployee = new ContractEmployee(4237, "John smith", "IT", 149000, 8);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(94372, "Susan Saltzman", "Management", 200, 60);
        SalariedEmployee salariedEmployee = new SalariedEmployee(8427, "Daemon Salvadore", "Call Center", 13000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(contractEmployee);
        employeeList.add(hourlyEmployee);
        employeeList.add(salariedEmployee);
        for (Employee employee : employeeList) {
            System.out.println(employee);
            System.out.println("Paycheck $ : " + employee.calculatePaycheck());
            System.out.println("After rise $ ");
            employee.giveRaise(1.2);
        }
    }
}
