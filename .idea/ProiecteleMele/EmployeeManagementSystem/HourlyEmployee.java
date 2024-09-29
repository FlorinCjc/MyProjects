package comGoogle.EmployeeManagementSystem;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(int id, String name, String department,double hourlyWage, double hoursWorked) {
        super(id, name, department);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePaycheck() {
        return hoursWorked * hourlyWage;
    }

    @Override
    public void giveRaise(double percentage) {
        System.out.println(percentage * calculatePaycheck());
    }

}
