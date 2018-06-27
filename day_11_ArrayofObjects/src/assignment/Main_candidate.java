package assignment;

import java.util.Scanner;

public class Main_candidate {

    static candidate_class[] team;
    static int NumofCandidates;

    public static void main(String[] arg) {
        Enroll();
        System.out.println(" " );
        Search();
        System.out.println(" " );
        GetPass();
    }

    public static void Enroll(){

        //candidate number for array size
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of candidates");
        NumofCandidates = input.nextInt();

        //array object created
        team = new candidate_class[NumofCandidates + 1];

        System.out.println("Let's start entering the data of candidates");


        for (int i = 1; i < team.length; i++) {
            team[i] = new candidate_class();
            System.out.println("Enter the data of candidate number " + i);
            team[i].Enter();
            team[i].Display();
            System.out.println(" ");
        }

    }

    public static void Search() {
        int exist = 0, Searchscore;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score you are looking for");
        Searchscore = input.nextInt();

        System.out.println("Here is the list who has the score " + Searchscore);

        for (int i = 1; i < team.length; i++) {
            if (Searchscore == team[i].Rscore()) {
                team[i].Display();
                exist++;
            }
        }

        if (exist < 1) {
            System.out.println("There is no record of candidates who have the score of " + Searchscore);

        }

    }

    public static void GetPass() {
        int exist = 0;
        System.out.println("Here is the list of candidates who have the score above 33 and pass the exam");

        for (int i = 1; i < team.length; i++) {
            if (33 <= team[i].Rscore()) {
                team[i].Display();
                exist++;
            }
        }

        if (exist < 1) {
            System.out.println("There is no record of candidates who have the score above 33 and pass the exam");

        }

    }



}
/*
Enter the number of candidates
3
Let's start entering the data of candidates
Enter the data of candidate number 1
Enter the candidate number
1
Enter the candidate name
df
Enter the Score
34
the candidate number: 1
the candidate name: df
the Score:34

Enter the data of candidate number 2
Enter the candidate number
2
Enter the candidate name
fhh
Enter the Score
57
the candidate number: 2
the candidate name: fhh
the Score:57

Enter the data of candidate number 3
Enter the candidate number
3
Enter the candidate name
fh
Enter the Score
89
the candidate number: 3
the candidate name: fh
the Score:89


Enter the score you are looking for
55
Here is the list who has the score 55
There is no record of candidates who have the score of 55

Here is the list of candidates who have the score above 33 and pass the exam
the candidate number: 1
the candidate name: df
the Score:34
the candidate number: 2
the candidate name: fhh
the Score:57
the candidate number: 3
the candidate name: fh
the Score:89
 */