package lesson8_2;

public class Homework8_2 {
    // Необходимо создать класс Employee со следующими методами:
    //getName - получить имя
    //setName
    //getBaseSalary - базовая ставка
    //setBaseSalary

    // Необходимо создать класс Worker где метод getSalaryWorker
    // будет возвращать зарплату, базовую ставку
    //Необходимо создать класс Manager в который нужно добавить следующие методы:
    //getNumberOfSubordinates - получить количество подчиненных
    //setNumberOfSubordinates
    //в классе, метод getSalaryManager будет возвращать значение
    // по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
    // Если количество подчиненных 0, то результат как у обычного рабочего.
    //Необходимо создать класс Director, метод getSalaryDirector должен
    // возвращать результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9).
    // Если количество подчиненных 0, то результат как у обычного рабочего.


    // Необходимо создать утилитарный класс со следующими методами:
    //поиск сотрудника в массиве по его имени
    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    //подсчет зарплатного бюджета для всех сотрудников в массиве
    //поиск наименьшей зарплаты в массиве
    //поиск наибольшей зарплаты в массиве
    //поиск наименьшего количества подчиненных в массиве менеджеров
    //поиск наибольшего количества подчиненных в массиве менеджеров
    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alex", 22_500),
                new Employee("Anna", 23_000),
                new Employee("Sergey", 21_000),
                new Employee("Nina", 55_500),
        };

        Worker[] manager = {
                new Manager("Alex", 40_000, 8),
                new Manager("Alex1", 40_000, 2),
                new Manager("Alex2", 40_000, 6),
                new Manager("Alex3", 40_000, 1)
        };

        System.out.println(Util.searchByName("Anna", employees));
        System.out.println(Util.searchSubByName("ex", employees));
        System.out.println("сумма зарплат всех работников: " + Util.sumSalary(employees));
        System.out.println("наименьшаяя зп в массиве: " + Util.minSalary(employees));
        System.out.println("наибольшая зп в массиве: " + Util.maxSalary(employees));
        System.out.println("наименьшее количество подчиненных: " + Util.minCountOfSubordinates(manager));
        System.out.println("наибольшее количество подчиненных: " + Util.maxCountOfSubordinates(manager));
        System.out.println("наибольшая надбавка: " + Util.maxAllowance(manager));
        System.out.println("наименьшая надбавки: " + Util.minAllowance(manager));
    }
}
