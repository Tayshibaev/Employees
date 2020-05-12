import java.util.Date;

public class Manager extends Employee {
    private double bonus;
    public void setBonus(double b) { bonus = b; }

    Manager(){
    }

    public Manager(String name, Date hireDate) {
        super(name, hireDate);
        bonus = 3;
    }

    @Override
    public String getName() {
        return "Manager" + super.getName();
    }
}
