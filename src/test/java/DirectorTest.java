import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Ozzy Osbourne", "XX000666", 68000, "Deployment", 100000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Ozzy Osbourne", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("XX000666", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(68000, director.getSalary(),0.00);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Deployment", director.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1200.50);
        assertEquals(69200.5, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(680, director.payBonus(), 0.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000.00, director.getBudget(), 0.00);
    }

}
