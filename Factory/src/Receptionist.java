
public class Receptionist implements User{
	  private String name;
	    private String shift;

	    public Receptionist(String name) {
	        this.name = name;
	        this.shift = "Morning";
	    }

	    @Override
	    public String getRole() {
	        return "Receptionist";
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public void displayInfo() {
	        System.out.println("Receptionist: " + name + " | Shift: " + shift);
	    }

	    // دالة خاصة بموظفي الاستقبال
	    public void setShift(String shift) {
	        this.shift = shift;
	    }
}
