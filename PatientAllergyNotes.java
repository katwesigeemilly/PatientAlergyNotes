class Patient {
    private final String patientID;
    private final String allergyNotes;

    // Constructor with parameters same as instance variables
    public Patient(String patientID, String allergyNotes) {
        this.patientID = patientID;      // 'this' resolves conflict
        this.allergyNotes = allergyNotes;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Allergies: " + allergyNotes);
    }
}

public class EMRTest {
    public static void main(String[] args) {
        Patient p = new Patient("P123", "Penicillin");
        p.displayInfo();
    }
}
