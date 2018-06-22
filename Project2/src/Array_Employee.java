public class Array_Employee {

public class Employee {
    private int Eno;
    private String Ename;
    private double Rate, Gross_Salary;

    double [] Hours = new double[7];
    double [] Salary = new double[7];

    //constructor1
    public Employee(){
        Eno = 0;
        Ename =" ";
        Rate = 0;
        Gross_Salary =0;

    }


    //for String, just use next()
    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        E_no = input.nextInt();
        System.out.println("Enter the Fname");
        E_Fname = input.next();
        System.out.println("Enter the Lname");
        E_Lname = input.next();
        System.out.println("Enter the DOJ");
        E_DOJ = input.next();
        System.out.println("Enter the Department");
        E_Department = input.next();
        System.out.println("Enter the Designation");
        E_Designation = input.next();
        System.out.println("Enter the Salary");
        E_Salary = input.nextDouble();

    }

    public void Display() {
        System.out.println("The Employee number is " + E_no);
        System.out.println("The Employee first name is " + E_Fname);
        System.out.println("The Employee last name is " + E_Lname);
        System.out.println("The Date of Joining is " + E_DOJ);
        System.out.println("The Department is " + E_Department);
        System.out.println("The Designation is " + E_Designation);
        System.out.println("The Salary is " + E_Salary);
    }
}