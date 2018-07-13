package Assignment2;


public class Truck extends Vehicle{

    private double load_capacity, towing_capacity;

    public Truck() {
        super();
        load_capacity = 100;
        towing_capacity = 100;
    }
    public Truck(double initial_load_capacity, double initial_towing_capacity) {
        super();
        load_capacity = initial_load_capacity;
        towing_capacity = initial_towing_capacity;
    }

    public void reset(String newName, String new_manufacturer, int new_cylinders, double new_load_capacity, double new_towing_capacity) {
        setName(newName);
        setManufacturer(new_manufacturer);
        setCylinders(new_cylinders);
        load_capacity = new_load_capacity;
        towing_capacity = new_towing_capacity;
    }

    public void writeOutput() {

        super.writeOutput();
        System.out.println("load_capacity : " + load_capacity);
        System.out.println("towing_capacity : " + towing_capacity);


    }

}
