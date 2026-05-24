public class MainProgram {
    // MAIN METHOD - RUNS THE PROGRAM
    public static void main(String[] args) {
        // === YOUR PERSONAL INFORMATION ALREADY HERE ===
        String fullName = "BORDEN, KEIN SYLVESTER C.";
        int userAge = 18;

        // CREATE OBJECT FROM DRIVERLICENSE CLASS
        DriverLicense student = new DriverLicense(fullName, userAge);

        // CALL FUNCTION TO DISPLAY RESULT
        student.checkEligibility();
    }
}
