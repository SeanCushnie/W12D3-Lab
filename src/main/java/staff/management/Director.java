package staff.management;
import staff.management.Manager;

public class Director extends Manager{

    private Double budget;
    public Director(String name, String niNumber, Double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}
