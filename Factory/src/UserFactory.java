
public class UserFactory {
	  public static User createUser(String type, String name) {
	        switch (type.toLowerCase()) {
	            case "patient":
	                return new Patient(name);
	            case "doctor":
	                return new Doctor(name);
	            case "receptionist":
	                return new Receptionist(name);
	            case "admin":
	                return new Admin(name);
	            default:
	                throw new IllegalArgumentException("Unknown user type: " + type);
	        }
	    }
}
