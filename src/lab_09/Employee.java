package lab_09;

public abstract class Employee {
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public abstract int getSalary();

    public abstract void setSalary(int salary);
}
