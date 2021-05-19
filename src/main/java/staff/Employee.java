package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double payRise){
        if(payRise > 0){
            this.salary += payRise;
        }

    }

    public double payBonus(){
        return salary * 0.01;
    }

    public void changeName(String newName){
        if(newName != ""){
            this.name = newName;
        }
    }
}
