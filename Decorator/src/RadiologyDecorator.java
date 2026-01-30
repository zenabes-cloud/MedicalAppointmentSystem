
public class RadiologyDecorator extends AppointmentDecorator{
	 private double radiologyCost = 400.00; // 400,00 ليرة سورية

	    public RadiologyDecorator(Appointment appointment) {
	        super(appointment);
	    }

	    @Override
	    public String getDescription() {
	        return decoratedAppointment.getDescription() + " + تصوير شعاعي";
	    }

	    @Override
	    public double getCost() {
	        return decoratedAppointment.getCost() + radiologyCost;
	    }
}
