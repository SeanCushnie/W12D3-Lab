import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before()
    {
        director = new Director("Boaby", "PA01", 100.00, "Front End", 100.00);
    }
    @Test
    public void hasName()
    {
        assertEquals("Boaby", director.getName());
    }

    @Test
    public void canSetName()
    {
        director.setName("Derek");
        assertEquals("Derek", director.getName());
    }


    @Test
    public void hasNiNumber()
    {
        assertEquals("PA01", director.getNiNumber());
    }


    @Test
    public void canSetNiNumber()
    {
        director.setNiNumber("PA02");
        assertEquals("PA02", director.getNiNumber());
    }


    @Test
    public void hasSalary()
    {
        assertEquals(100.00, director.getSalary(), 0.01);
    }


    @Test
    public void canSetSalary()
    {
        director.setSalary(150.00);
        assertEquals(150.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName()
    {
        assertEquals("Front End", director.getDeptName());
    }
    @Test
    public void hasBudget()
    {
        assertEquals(100, director.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget()
    {
        director.setBudget(110.00);
        assertEquals(110, director.getBudget(), 0.01);
    }
}