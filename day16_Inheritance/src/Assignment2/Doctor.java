package Assignment2;


/*
Define a class named Doctor whose objects are records for a clinic’s doctors.
Derive this class from the class Person given in Lesson.
A Doctor record has the doctor’s name—defined in the class Person
—a specialty as a string
(for example Pediatrician, Obstetrician, General Practitioner, and so on),
 an office-visit fee (use the type double).
Give your class a reasonable complement of constructors and accessor methods,.
 Write a driver program to test all your methods.
 */
public class Doctor extends Person {

    private double visit_fee;
    private String specialty;

    public Doctor() {
        super();
        visit_fee= 100;
        specialty = " ";
    }

    public Doctor(String initialName, String initial_specialty, double initial_visit_fee) {
        super(initialName);
        visit_fee = initial_visit_fee;
        specialty = initial_specialty;
    }

    public void reset(String newName, String new_specialty, double new_visit_fee) {
        setName(newName);
        visit_fee = new_visit_fee;
        specialty = new_specialty;
    }

    public void setSpecialty(String change_Specialty){
        specialty = change_Specialty;
    }

    public String getSpecialty(){

        return specialty;
    }

    public double getVisit_fee(){
        return visit_fee;
    }

    public void writeOutput() {

        System.out.println("Name: " + getName());
        System.out.println("visit fee : " + getVisit_fee());
        System.out.println("specialty : " + getSpecialty());


    }


}
