package staff;

public class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary ){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double payRise){
        this.salary *= payRise;
    }
}
