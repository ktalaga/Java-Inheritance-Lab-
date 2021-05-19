import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Konrad Talaga", "GG123456", 44000, "Testing");
    }

    @Test
    public void hasName(){

    }

}
