import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jimi Hendrix", "AB123412", 32000);
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

}
