package String_Assignment;

public class c_1 {

    public static void main(String[] args){


        String[] list = { "Hello", "Amazon","Java", "too", "much", "HW", "awesome" };

        for (int i=0; i<list.length; i++){
            if(list[i].substring(0, 1).equalsIgnoreCase("a")){
                System.out.println(list[i]);
            }
        }

    }
}


/*
Amazon
awesome
 */