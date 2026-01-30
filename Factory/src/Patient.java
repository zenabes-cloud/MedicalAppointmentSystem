
public class Patient implements User {
    private String name;
    private String medicalHistory;

    public Patient(String name) {
        this.name = name;
        this.medicalHistory = "No history yet";
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + " | Medical History: " + medicalHistory);
    }

    // دالة خاصة بالمرضى فقط
    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
}
