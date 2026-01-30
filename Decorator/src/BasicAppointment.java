
public class BasicAppointment implements Appointment  {
    private String doctorName;
    private String date;
    private double baseCost = 500.00; // 500,00 ليرة سورية - سعر الكشف الأساسي
    public BasicAppointment(String doctorName, String date) {
        this.doctorName = doctorName;
        this.date = date;
    }

    @Override
    public String getDescription() {
        return "موعد مع د. " + doctorName + " في " + date;
    }

    @Override
    public double getCost() {
        return baseCost;
    }
}
