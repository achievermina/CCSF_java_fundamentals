import java.util.Scanner;

public class BOOK {

    private int Bno;
    private String Bname, Author;
    private float Price;
    Scanner input = new Scanner(System.in);

    public void Enter(){

        System.out.println("Enter the book number");
        Bno = input.nextInt();
        System.out.println("Enter the book name");
        Bname = input.next();
        System.out.println("Enter the book Author");
        Author = input.next();
        System.out.println("Enter the book Price");
        Price = input.nextFloat();

    }

    public void Display(){
        System.out.println("the book number: "+Bno);
        System.out.println("the book name: "+Bname);
        System.out.println("the book Author:" +Author);
        System.out.println("the book Price:"+Price);

    }

    public int RBno(){
        return Bno;

    }


    public String RBname(){
        return Bname;

    }


}
