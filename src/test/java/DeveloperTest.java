import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("John Mayer", "BB121212", 27000);
    }

    @Test
    public void hasName(){
        assertEquals("John Mayer", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("BB121212", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000, developer.getSalary(),0.00);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1200.50);
        assertEquals(28200.5, developer.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(270, developer.payBonus(), 0.00);
    }

    @Test
    public void canRefuseToRaiseSalaryIfPayRiseIsNegative(){
        developer.raiseSalary(-1200.50);
        assertEquals(27000, developer.getSalary(), 0.00);
    }


}
