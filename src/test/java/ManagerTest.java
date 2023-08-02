import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before()
    {
        manager = new Manager("Boaby", "PA01", 100.00, "Front End");
    }




    @Test
    public void hasName()
    {
        assertEquals("Boaby", manager.getName());
    }

    @Test
    public void canSetName()
    {
        manager.setName("Derek");
        assertEquals("Derek", manager.getName());
    }


    @Test
    public void hasNiNumber()
    {
        assertEquals("PA01", manager.getNiNumber());
    }


    @Test
    public void canSetNiNumber()
    {
        manager.setNiNumber("PA02");
        assertEquals("PA02", manager.getNiNumber());
    }


   @Test
    public void hasSalary()
    {
        assertEquals(100.00, manager.getSalary(), 0.01);
    }


    @Test
    public void canSetSalary()
    {
        manager.setSalary(150.00);
        assertEquals(150.00, manager.getSalary(), 0.01);
    }


    @Test
    public void hasDeptName()
    {
        assertEquals("Front End", manager.getDeptName());
    }


    @Test
    public void canRaiseSalary()
    {
        manager.raiseSalary(10.00);
        assertEquals(110.00, manager.getSalary(), 0.01);
    }


    @Test
    public void canPayBonus()
    {
        Double bonus = manager.payBonus();
        Double expectedSalary = manager.getSalary() + bonus;
        assertEquals(101, manager.getSalary(), 0.01);
    }


}
