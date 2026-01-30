
public class Admin implements User{
    private String name;
    private String department;

    public Admin(String name) {
        this.name = name;
        this.department = "Administration";
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name + " | Department: " + department);
    }

    // دالة خاصة بالإدارة
    public void setDepartment(String dept) {
        this.department = dept;
    }
}
