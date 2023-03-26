class Nurse extends HospitalEmployee {
    private int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }

    @Override
    public void work() {
        System.out.println(name + " works for the hospital. " + name + " is a nurse with " + numOfPatients + " patients.");
    }
}

class Doctor extends HospitalEmployee {
     protected String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + " " + specialty;
    }

    @Override
    public void work() {
        System.out.println(name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor.");
    }
}

class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return super.toString() + " Operating: " + operating;
    }

    @Override
    public void work() {
        System.out.println(name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor. " + name + " is " + (operating ? "operating now." : "not operating."));
    }
}

public class Hospital {
    public static void main(String[] args) {
        Nurse nurse = new Nurse("Sonny", 789, 6);
        Doctor doctor1 = new Doctor("Michael", 234, "Heart");
        Doctor doctor2 = new Surgeon("Vincent", 645, "Brain", true);
        HospitalEmployee employee = new HospitalEmployee("Vito", 123);
        
        
        System.out.println(employee);
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(nurse);

        employee.work();
        doctor1.work();
        doctor2.work();
        nurse.work();
    }
}

