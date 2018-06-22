public class instance {
    public static void main(String[] args){

//first object
        Employee E1 = new Employee();
        E1.Display();

//second object
        Employee E2 = new Employee(10,"Mina","Lee","May,2017","Engineering","Manager",100000);
        E2.Display();

//third object
        Employee E3 = new Employee();
        E3.Input();
        E3.Display();

    }

}
/*
The Employee number is 0
The Employee first name is
The Employee last name is
The Date of Joining is
The Department is
The Designation is
The Salary is 0.0
The Employee number is 10
The Employee first name is Mina
The Employee last name is Lee
The Date of Joining is May,2017
The Department is Engineering
The Designation is Manager
The Salary is 100000.0
Enter the number
1
Enter the Fname
Jee
Enter the Lname
Lee
Enter the DOJ
May
Enter the Department
Finance
Enter the Designation
Assistant
Enter the Salary
20000
The Employee number is 1
The Employee first name is Jee
The Employee last name is Lee
The Date of Joining is May
The Department is Finance
The Designation is Assistant
The Salary is 20000.0
 */