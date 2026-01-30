
public class PatientObserver implements Observer{

	   private String patientName;

	    public PatientObserver(String patientName) {
	        this.patientName = patientName;
	    }

	    @Override
	    public void update(Appointment appointment) {
	        System.out.println("إشعار للمريض " + patientName + ": تم تغيير حالة الموعد "
	                + appointment.getId() + " إلى " + appointment.getStatus());
	    }

}
