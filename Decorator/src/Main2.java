
public class Main2 {
	 public static void main(String[] args) {
	        System.out.println("=== نظام حجز المواعيد مع خدمات إضافية ===\n");

	        // 1. موعد أساسي فقط
	        Appointment basic = new BasicAppointment("محمد", "2025-01-15");
	        System.out.println("1. " + basic.getDescription());
			System.out.println("   التكلفة: " + basic.getCost() + " ل.س\n");

	        // 2. موعد + فحص مخبري
	        Appointment withLabTest = new LabTestDecorator(basic);
	        System.out.println("2. " + withLabTest.getDescription());
	        System.out.println("   التكلفة: " + withLabTest.getCost() + " ل.س\n");


	        // 3. موعد + فحص مخبري + أشعة
	        Appointment withLabAndXRay = new RadiologyDecorator(withLabTest);
	        System.out.println("3. " + withLabAndXRay.getDescription());
	        System.out.println("   التكلفة: " + withLabAndXRay.getCost() + " ل.س\n");

	        // 4. موعد + كل الخدمات
	        Appointment fullPackage = new ConsultationDecorator(withLabAndXRay);
	        System.out.println("4. " + fullPackage.getDescription());
	        System.out.println("   التكلفة: " + fullPackage.getCost() + " ل.س\n");

	        // 5. طلب آخر: موعد + استشارة فقط
	        Appointment anotherBasic = new BasicAppointment("سارة", "2025-01-16");
	        Appointment withConsultation = new ConsultationDecorator(anotherBasic);
	        System.out.println("5. " + withConsultation.getDescription());
	        System.out.println("   التكلفة: " + withConsultation.getCost() + " ل.س");
	    }
}
