package comGoogle.EmployeeManagementSystem;

public class ContractEmployee extends Employee {
    private double contractAmount;
    private double contractDuration;

    public ContractEmployee(int id, String name, String department, double contractAmount, double contractDuration) {
        super(id, name, department);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
    }

    @Override
    public double calculatePaycheck() {
        return contractAmount / contractDuration;
    }

    @Override
    public void giveRaise(double percentage) {
        System.out.println(percentage * calculatePaycheck());
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public ContractEmployee setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
        return this;
    }

    public double getContractDuration() {
        return contractDuration;
    }

    public ContractEmployee setContractDuration(double contractDuration) {
        this.contractDuration = contractDuration;
        return this;

    }
}
