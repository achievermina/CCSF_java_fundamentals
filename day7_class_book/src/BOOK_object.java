public class BOOK_object {

    public static void main(String[] arg){

        BOOK book1 = new BOOK();
        book1.Enter();
        book1.Display();

       if(book1.RBno()>1000)
            System.out.println(book1.RBname() +" is a new Book");
       else
            System.out.println(book1.RBname()+" is an old Book");

    }
}
/*
Enter the book number
1002
Enter the book name
haha
Enter the book Author
mina
Enter the book Price
95
the book number: 1002
the book name: haha
the book Author:mina
the book Price:95.0
haha is a new Book

 */