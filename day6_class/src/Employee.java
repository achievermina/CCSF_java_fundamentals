import java.util.Scanner;

public class Employee {
    public int E_no;
    public String E_Fname, E_Lname, E_DOJ, E_Department, E_Designation;
    public double E_Salary;

//for String, just use next()
    public void Input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        E_no=input.nextInt();
        System.out.println("Enter the Fname");
        E_Fname=input.next();
        System.out.println("Enter the Lname");
        E_Lname=input.next();
        System.out.println("Enter the DOJ");
        E_DOJ=input.next();
        System.out.println("Enter the Department");
        E_Department=input.next();
        System.out.println("Enter the Designation");
        E_Designation=input.next();
        System.out.println("Enter the Salary");
        E_Salary=input.nextDouble();

    }

    public void Display(){
        System.out.println("The Employee number is "+ E_no);
        System.out.println("The Employee first name is "+E_Fname);
        System.out.println("The Employee last name is "+E_Lname);
        System.out.println("The Date of Joining is "+E_DOJ);
        System.out.println("The Department is "+E_Department);
        System.out.println("The Designation is "+E_Designation);
        System.out.println("The Salary is "+E_Salary);
    }
//constructor1
    public Employee(){
        E_no = 0;
        E_Fname =" ";
        E_Lname=" ";
        E_DOJ=" ";
        E_Department=" ";
        E_Designation=" ";
        E_Salary = 0;
    }
//constructor2
    public Employee(int no, String Fname, String Lname, String DOJ, String Department, String Designation , double Salary){
        E_no = no;
        E_Fname =Fname;
        E_Lname=Lname;
        E_DOJ=DOJ;
        E_Department=Department;
        E_Designation=Designation;
        E_Salary = Salary;
    }
}
