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

}
