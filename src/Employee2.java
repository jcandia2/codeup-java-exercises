public class Employee2  extends Person{
    private String department;

    public Employee2(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
