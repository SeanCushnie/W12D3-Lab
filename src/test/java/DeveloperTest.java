import staff.techstaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before()
    {
        developer = new Developer("Boaby", "PA01", 100.00);
    }
    @Test
    public void hasName()
    {
        assertEquals("Boaby", developer.getName());
    }

    @Test
    public void canSetName()
    {
        developer.setName("Derek");
        assertEquals("Derek", developer.getName());
    }


    @Test
    public void hasNiNumber()
    {
        assertEquals("PA01", developer.getNiNumber());
    }


    @Test
    public void canSetNiNumber()
    {
        developer.setNiNumber("PA02");
        assertEquals("PA02", developer.getNiNumber());
    }


    @Test
    public void hasSalary()
    {
        assertEquals(100.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canSetSalary()
    {
        developer.setSalary(150.00);
        assertEquals(150.00, developer.getSalary(), 0.01);
    }
}

