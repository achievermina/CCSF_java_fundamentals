import java.util.Scanner;

public class CANDIDATE {

    private int Cno;
    private String Cname;
    private int Score;
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

    public void CheckScore(){
        if(Score>90)
            System.out.println("Excellent");
        else if(Score>80)
            System.out.println("Good");
        else
            System.out.println("Average");

    }




    }



