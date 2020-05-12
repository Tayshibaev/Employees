import java.util.Date;

class Employee extends AbstractEmployee implements Worker {
    public static int count;
    private String name = "Vasya";
    private String surname;
    private double salary = 123456;
    private Date hireDate;

    static Employee getInstance() {
        String c = new Employee().name;
        count++;
        return new Employee();
    }

    static {

    }

    @Override
    public void doJob() {
        System.out.println("Good work!");
    }

    @Override
    public void doEm() {

    }


    static class Manager implements OfficeWorker{
        int code = 7;

        @Override
        public void dodo() {
            int j =count;
        }
        @Override
        public void doJob() {

        }
    }

    public static int getCount() {
        return count;
    }

    Employee() {
        count++;
    }

    public Employee(Date hireDate, String surname) {
        this.hireDate = hireDate;
        this.surname = surname;
        count++;
    }

     public Employee(String name, Date hireDate) {
        this.hireDate = hireDate;
        this.name = name;
        count++;
    }

    public Employee(String name, double salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    final public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setHireDate(int year, int month, int day) {
        hireDate = new Date(year, month, day);
    }

    String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }
}
