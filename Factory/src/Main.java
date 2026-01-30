
public class Main {
	public static void main(String[] args) {
        // 1. نستخدم المصنع عشان ننشئ المستخدمين
        User patient = UserFactory.createUser("patient", "أحمد");
        User doctor = UserFactory.createUser("doctor", "محمد");
        User receptionist = UserFactory.createUser("receptionist", "سارة");
        User admin = UserFactory.createUser("admin", "علي");

        // 2. نعرض معلوماتهم
        patient.displayInfo();
        doctor.displayInfo();
        receptionist.displayInfo();
        admin.displayInfo();

        // 3. نستخدم الدوال الخاصة بكل نوع
        if (patient instanceof Patient) {
            ((Patient) patient).setMedicalHistory("سكري");
            patient.displayInfo();
        }

        if (doctor instanceof Doctor) {
            ((Doctor) doctor).setSpecialization("أمراض قلب");
            doctor.displayInfo();
        }
    }
}
