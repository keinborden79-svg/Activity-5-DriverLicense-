public class DriverLicense {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public DriverLicense(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // VOID FUNCTION - CHECK ELIGIBILITY
    public void checkEligibility() {
        System.out.println("===== DRIVER'S LICENSE ELIGIBILITY SYSTEM =====");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age + " years old");
        System.out.println("----------------------------------------");

        // CONDITIONAL STATEMENTS
        if (age >= 18) {
            eligibleForLicense();
        } 
        else if (age == 17) {
            eligibleForStudentPermit();
        } 
        else {
            notEligible();
        }
    }

    // VOID FUNCTION 1: 18 & ABOVE
    public void eligibleForLicense() {
        System.out.println("✅ ELIGIBLE FOR DRIVER'S LICENSE");
        System.out.println("\n📋 REQUIREMENTS NEEDED:");
        System.out.println("• Birth Certificate (PSA Original)");
        System.out.println("• Valid Government ID");
        System.out.println("• Medical Certificate from Accredited Clinic");
        System.out.println("\n🖥️ ONLINE EXAM PORTAL:");
        System.out.println("Visit: www.lto-onlineexam.gov.ph");
        System.out.println("Complete Written & Practical Exam to get license.");
    }

    // VOID FUNCTION 2: EXACTLY 17
    public void eligibleForStudentPermit() {
        System.out.println("⚠️ ELIGIBLE ONLY FOR STUDENT PERMIT");
        System.out.println("\n📌 REMINDER: Must be accompanied by licensed driver when driving.");
        System.out.println("\n📚 EDUCATIONAL RESOURCES:");
        System.out.println("• Video: Road Signs & Symbols");
        System.out.println("• Video: Traffic Rules & Regulations");
        System.out.println("• Video: Safe Driving Practices");
    }

    // VOID FUNCTION 3: BELOW 17
    public void notEligible() {
        System.out.println("❌ NOT ELIGIBLE YET");
        System.out.println("\n⌛ REMINDER: Wait until age 17 for Student Permit.");
        System.out.println("At age 18, you can apply for Driver's License.");
        System.out.println("\n📚 EDUCATIONAL RESOURCES:");
        System.out.println("• Video: Introduction to Driving");
        System.out.println("• Video: Importance of Traffic Laws");
    }
}
