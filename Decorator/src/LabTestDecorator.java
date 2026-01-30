
public class LabTestDecorator extends AppointmentDecorator {
	  private double labCost = 250.00; // 250,00 ليرة سورية

	    public LabTestDecorator(Appointment appointment) {
	        super(appointment);
	    }

	    @Override
	    public String getDescription() {
	        return decoratedAppointment.getDescription() + " + فحص مخبري";
	    }

	    @Override
	    public double getCost() {
	        return decoratedAppointment.getCost() + labCost;
	    }
}
