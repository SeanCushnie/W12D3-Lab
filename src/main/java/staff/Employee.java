package staff;

public abstract class Employee
{
    private String name;
    private String niNumber;
    private Double salary;


    public Employee(String name, String niNumber, Double salary)
    {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNiNumber()
    {
        return niNumber;
    }

    public void setNiNumber(String niNumber)
    {
        this.niNumber = niNumber;
    }

    public Double getSalary()
    {
        return this.salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public Double raiseSalary(Double amount)
    {
        return this.salary += amount;

    }

    public Double payBonus()
    {
        Double increasedSalary = this.salary * 0.01;
        this.salary += increasedSalary;
        return increasedSalary;
    }
}
