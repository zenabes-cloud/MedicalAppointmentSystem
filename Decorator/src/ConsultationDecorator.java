
public class ConsultationDecorator extends AppointmentDecorator{
	  private double consultationCost = 200.00; // 200,00 ليرة سورية

	    public ConsultationDecorator(Appointment appointment) {
	        super(appointment);
	    }

	    @Override
	    public String getDescription() {
	        return decoratedAppointment.getDescription() + " + استشارة إضافية";
	    }

	    @Override
	    public double getCost() {
	        return decoratedAppointment.getCost() + consultationCost;
	    }

}
