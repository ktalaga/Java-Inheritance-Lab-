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
        assertEquals("Jimi Hendrix", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB123412", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000, databaseAdmin.getSalary(),0.00);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1200.50);
        assertEquals(33200.50, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(320, databaseAdmin.payBonus(), 0.00);
    }

    @Test
    public void canRefuseToRaiseSalaryIfPayRiseIsNegative(){
        databaseAdmin.raiseSalary(-1200.50);
        assertEquals(32000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canChangeNameIfNewNameIsNotAnEmptyString(){
        databaseAdmin.changeName("Bob Marley");
        assertEquals("Bob Marley", databaseAdmin.getName());
    }

    @Test
    public void canRefuseToChangeNameIfNewNameIsAnEmptyString(){
        databaseAdmin.changeName("");
        assertEquals("Jimi Hendrix", databaseAdmin.getName());
    }

}
