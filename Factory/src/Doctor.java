
public class Doctor implements User{
    private String name;
    private String specialization;

    public Doctor(String name) {
        this.name = name;
        this.specialization = "General";
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dr. " + name + " | Specialization: " + specialization);
    }

    // دالة خاصة بالأطباء فقط
    public void setSpecialization(String spec) {
        this.specialization = spec;
    }
}
