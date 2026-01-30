
public abstract class AppointmentDecorator implements Appointment{
	  protected Appointment decoratedAppointment;

	    public AppointmentDecorator(Appointment appointment) {
	        this.decoratedAppointment = appointment;
	    }

	    @Override
	    public String getDescription() {
	        return decoratedAppointment.getDescription();
	    }

	    @Override
	    public double getCost() {
	        return decoratedAppointment.getCost();
	    }
}
