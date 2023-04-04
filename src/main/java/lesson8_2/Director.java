package lesson8_2;

public class Director extends Worker {


    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalary() {
        // <базовая ставка> * (<количество подчиненных> / 100 * 9)
        this.baseSalary = baseSalary * (getNumberOfSubordinates() / 100 * 9);
        if (getNumberOfSubordinates() == 0) {
            return baseSalary;
        }
        return baseSalary;
    }
}
