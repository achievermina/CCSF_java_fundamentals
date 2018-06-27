package assignment;
import java.util.Scanner;

public class candidate_class {

    private int Cno, Score;
    private String Cname;


    Scanner input = new Scanner(System.in);

    public void Enter(){

        System.out.println("Enter the candidate number");
        Cno = input.nextInt();
        System.out.println("Enter the candidate name");
        Cname = input.next();
        System.out.println("Enter the Score");
        Score = input.nextInt();

    }

    public void Display(){
        System.out.println("the candidate number: "+Cno);
        System.out.println("the candidate name: "+Cname);
        System.out.println("the Score:" + Score);

    }
    //getter method to get private
    public int Rscore(){
        return this.Score;
    }




}


