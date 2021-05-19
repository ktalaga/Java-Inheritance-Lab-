import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Konrad Talaga", "GG123456", 44000, "Testing");
    }

    @Test
    public void hasName(){
    assertEquals("Konrad Talaga", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GG123456", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(44000, manager.getSalary(),0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Testing", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1200.50);
        assertEquals(45200.5, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(440, manager.payBonus(), 0.00);
    }

    @Test
    public void canRefuseToRaiseSalaryIfPayRiseIsNegative(){
        manager.raiseSalary(-1200.50);
        assertEquals(44000, manager.getSalary(), 0.00);
    }
    @Test
    public void canChangeNameIfNewNameIsNotAnEmptyString(){
        manager.changeName("Bob Marley");
        assertEquals("Bob Marley", manager.getName());
    }

    @Test
    public void canRefuseToChangeNameIfNewNameIsAnEmptyString(){
        manager.changeName("");
        assertEquals("Konrad Talaga", manager.getName());
    }

}
