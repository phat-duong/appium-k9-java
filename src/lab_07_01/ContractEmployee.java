package lab_07_01;

public class ContractEmployee extends Employee{
    private int salary = 40000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
