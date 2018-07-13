import Assignment2.Employee;
import Assignment2.Doctor;
import Assignment2.Vehicle;
import Assignment2.Truck;
import Assignment2.Person;

public class main {

    public static void main(String[] arg) {

        Person p = new Person();
        p.setName("mina");

        Employee e1 = new Employee();

        e1.reset("mina", 2014, 1000);
        e1.writeOutput();
        if (p.hasSameName(e1))
            System.out.println("Wow!");


        Doctor d1 = new Doctor("mina","cardio",100);

        d1.writeOutput();
        d1.reset("mina","cardio",150);
        d1.writeOutput();

        Vehicle v1 = new Vehicle("haha","BMW",6);
        v1.writeOutput();
        v1.setManufacturer("Audi");
        v1.writeOutput();

        Truck t1 = new Truck(150, 200);
        t1.writeOutput();
        t1.setName("pi");
        t1.setManufacturer("Honda");
        t1.writeOutput();

    }
}

/*
Name: mina
Hired year : 2014
Annual Salary : 1000.0

Name: mina
visit fee : 100.0
specialty : cardio

Name: mina
visit fee : 150.0
specialty : cardio

Name: haha
manufacturer : BMW
cylinders : 6

Name: haha
manufacturer : Audi
cylinders : 6

Name: No name yet
manufacturer :
cylinders : 4
load_capacity : 150.0
towing_capacity : 200.0

Name: pi
manufacturer : Honda
cylinders : 4
load_capacity : 150.0
towing_capacity : 200.0
 */