package lesson8_2;

public class Employee {
    private String name;
    int baseSalary;


    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        baseSalary = baseSalary;
    }
}