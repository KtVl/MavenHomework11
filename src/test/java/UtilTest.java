import lesson8_2.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilTest {
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

    @Test
    public void testSumSalary() {
        Assert.assertEquals(Util.sumSalary(employees), 122000);
    }

    @Test
    public void testMinSalary() {
        Assert.assertEquals(Util.minSalary(employees), 21000);
    }

    @Test
    public void testSearchSubByName() {
        Assert.assertEquals(Util.searchSubByName("Anna", employees), true);
    }

    @Test
    public void testMaxSalary() {
        Assert.assertEquals(Util.maxSalary(employees), 55500);
    }

    @Test
    public void testMinCountOfSubordinates() {
        Assert.assertEquals(Util.minCountOfSubordinates(manager), 1);
    }

    @Test
    public void testMaxCountOfSubordinates() {
        Assert.assertEquals(Util.maxCountOfSubordinates(manager), 8);
    }

    @Test
    public void testMaxAllowance() {
        Assert.assertEquals(Util.maxAllowance(manager), 9600);
    }
}
