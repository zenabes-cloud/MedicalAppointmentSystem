
public class DoctorObserver implements Observer {
	   private String doctorName;

	    public DoctorObserver(String doctorName) {
	        this.doctorName = doctorName;
	    }

	    @Override
	    public void update(Appointment appointment) {
	        System.out.println("إشعار للدكتور " + doctorName + ": تم تغيير حالة الموعد "
	                + appointment.getId() + " إلى " + appointment.getStatus());
	    }
	}

