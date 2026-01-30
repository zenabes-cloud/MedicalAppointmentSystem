
public class Main {
	 public static void main(String[] args) {
	        // 1. إنشاء موعد
	        Appointment appointment = new Appointment("A001", "2025-12-01", "10:30");

	        // 2. إنشاء المراقبين
	        Observer patient = new PatientObserver("أحمد");
	        Observer doctor = new DoctorObserver("د. محمد");
	        Observer receptionist = new ReceptionistObserver("سامي");

	        // 3. ربط المراقبين بالموعد (الاشتراك)
	        appointment.attach(patient);
	        appointment.attach(doctor);
	        appointment.attach(receptionist);

	        // 4. تغيير حالة الموعد → سيتم إعلام الجميع تلقائيًا
	        appointment.setStatus("مؤكد");

	        // 5. إزالة أحد المراقبين (مثال: المريض)
	        appointment.detach(patient);

	        // 6. تغيير حالة أخرى → سيتم إعلام الباقين فقط
	        appointment.setStatus("ملغي");
	    }
}
