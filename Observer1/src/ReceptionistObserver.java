
public class ReceptionistObserver implements Observer{
    private String receptionistName;

    public ReceptionistObserver(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    @Override
    public void update(Appointment appointment) {
        System.out.println("إشعار لموظف الاستقبال " + receptionistName 
                + ": تم تغيير حالة الموعد " + appointment.getId() 
                + " إلى " + appointment.getStatus());
    }
}
