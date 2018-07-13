package Assignment2;


/*
Create a base class called Vehicle that has

the manufacturer’s name (type String),
number of cylinders in the engine (type int),
 and owner (type Person given in Lesson).

  Then create a class called Truck that is derived from Vehicle and has additional properties:
the load capacity in tons (type double, since it may contain a fractional part)
and towing capacity in tons (type double).
 Give your classes a reasonable complement of constructors and accessor methods.

 Write a driver program that tests all your methods.
 */

public class Vehicle extends Person{

    private String manufacturer;
    private int cylinders;

    public Vehicle() {
        super();
        manufacturer = " ";
        cylinders = 4;
    }

    public Vehicle(String initialName, String initial_manufacturer, int initial_cylinders) {
        super(initialName);
        manufacturer = initial_manufacturer;
        cylinders = initial_cylinders;
    }

    public void reset(String newName, String new_manufacturer, int new_cylinders) {
        setName(newName);
        setManufacturer(new_manufacturer);
        setCylinders(new_cylinders);
    }


    public void setManufacturer(String new_manufacturer){

        manufacturer = new_manufacturer;
    }
    public String getManufacturer(){

        return manufacturer;
    }

    public void setCylinders(int new_cylinders){

        cylinders = new_cylinders;
    }
    public int getCylinders(){

        return cylinders;
    }

    public void writeOutput() {

        super.writeOutput();
        System.out.println("manufacturer : " + manufacturer);
        System.out.println("cylinders : " + cylinders);


    }




}
