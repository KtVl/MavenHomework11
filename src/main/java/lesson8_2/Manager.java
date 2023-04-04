package lesson8_2;

public class Manager extends Worker {


    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);

    }

    public int getSalary() {
        // <базовая ставка> * (<количество подчиненных> / 100 * 3)
        this.baseSalary = baseSalary * (getNumberOfSubordinates() / 100 * 3);
        if (getNumberOfSubordinates() == 0) {
            return baseSalary;
        }
        return baseSalary;
    }
}
