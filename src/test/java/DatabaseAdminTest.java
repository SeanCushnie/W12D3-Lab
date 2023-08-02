import staff.techstaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before()
    {
        databaseAdmin = new DatabaseAdmin("Boaby", "PA01", 100.00);
    }
    @Test
    public void hasName()
    {
        assertEquals("Boaby", databaseAdmin.getName());
    }

    @Test
    public void canSetName()
    {
        databaseAdmin.setName("Derek");
        assertEquals("Derek", databaseAdmin.getName());
    }


    @Test
    public void hasNiNumber()
    {
        assertEquals("PA01", databaseAdmin.getNiNumber());
    }


    @Test
    public void canSetNiNumber()
    {
        databaseAdmin.setNiNumber("PA02");
        assertEquals("PA02", databaseAdmin.getNiNumber());
    }


    @Test
    public void hasSalary()
    {
        assertEquals(100.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canSetSalary()
    {
        databaseAdmin.setSalary(150.00);
        assertEquals(150.00, databaseAdmin.getSalary(), 0.01);
    }
}
