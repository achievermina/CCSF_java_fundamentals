package Assignment2;

/*

An employee record inherits an employee’s name
from the class Person.
In addition, an employee record contains an annual salary
represented as a single value of type double,
a hire date that gives the year hired as a single value of type int,
 and an identification number that is a value of type String.
 Give your class a reasonable complement of constructors,
 accessor methods, and mutator methods.
Write a program to fully test your class definition.
 */

public class Employee extends Person {

    private int hired_year;
    private double annual_salary;

    public Employee() {
        super();
        hired_year = 0;
        annual_salary = 0;
    }

    public Employee(String initialName, int initial_hired_year, double initial_annual_salary) {
        super(initialName);
        hired_year = initial_hired_year;
        annual_salary = initial_annual_salary;
    }

    public void setHired_year(int newhired_year){

        hired_year = newhired_year;
    }
    public int getHired_year(){

        return hired_year;
    }

    public void setSalary(double newSalary){

        annual_salary = newSalary;
    }
    public double getSalary(){

        return annual_salary;
    }


    public void reset(String newName, int new_hired_year, double new_annual_salary) {
        setName(newName);
        hired_year = new_hired_year;
        annual_salary = new_annual_salary;
    }



    //overriding! the same method

    public void writeOutput() {

        System.out.println("Name: " + getName());
        System.out.println("Hired year : " + getHired_year());
        System.out.println("Annual Salary : " + getSalary());


    }



}



