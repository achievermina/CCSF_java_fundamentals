package String_Assignment;
import java.util.Scanner;

public class c_2 {

    public static void main(String[] args){
        int result=0;
        Scanner input = new Scanner(System.in);
        String[] list = { "Hello", "Amazon","Java", "too", "much", "HW", "awesome" };
        for (String a : list) {
             System.out.print(a+" ");
        }
        System.out.println("");
        System.out.println("Please enter the word you are searching for");
        String Search= input.next();


        for (int i=0; i<list.length; i++) {

            if (Search.equalsIgnoreCase(list[i])) {
                result += (i + 1);
            } else {
                result += 0;
            }
        }
                        //display the location
            if(result>0)
                System.out.println("The location is "+ result);
            else
                System.out.println("We cannot find the word");


    }
}

/*
Hello Amazon Java too much HW awesome
Please enter the word you are searching for
ddfd
We cannot find the word

Hello Amazon Java too much HW awesome
Please enter the word you are searching for
Too
The location is 4

 */


