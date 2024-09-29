package comGoogle.EmployeeManagementSystem;

public class SalariedEmployee extends Employee {
    private  double annualSalary;

    public SalariedEmployee(int id, String name, String department, double annualSalary) {
        super(id, name, department);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePaycheck() {
        return annualSalary / 26;
    }

    @Override
    public void giveRaise(double percentage) {
        System.out.println(calculatePaycheck() * percentage);
    }



    public double getAnnualSalary() {
        return annualSalary;
    }

    public SalariedEmployee setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
        return this;
    }

}
