import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String id;
    private String date;
    private String time;
    private String status; // مثال: "مؤكد", "ملغي", "معدل"
    private List<Observer> observers = new ArrayList<>();

    // Constructor
    public Appointment(String id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.status = "معلّق";
    }

    // إضافة مراقب
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // إزالة مراقب
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // إعلام كل المراقبين
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // تغيير حالة الموعد وإشعار المراقبين
    public void setStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("تم تغيير حالة الموعد " + id + " إلى: " + newStatus);
        notifyObservers(); // إعلام الجميع
    }

    // Getters
    public String getId() { return id; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getStatus() { return status; }
}

