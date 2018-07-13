package assignment4;

import Assignment2.Person;

public class TitledPerson extends Person {
    private String title;

    public TitledPerson(){
        super();
        title = "";
    }

    public TitledPerson(String initialName, String initialTitle){
        setName(initialName);
        title = initialTitle;
    }

    public void writeOutput(){
        super.writeOutput();
        System.out.println("title is "+title);
    }

    public void reset(String newName, String newTitle){
        setName(newName);
        setTitle(newTitle);
    }

    public boolean equals(TitledPerson person){
        return this.hasSameName(person) &&
                (this.title == person.title);
    }

    public String getTitle(){

        return title;
    }

    public void setTitle(String new_title){
        title = new_title;
    }

}
