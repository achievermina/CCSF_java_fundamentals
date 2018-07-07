public class main {
  public static void main(String[] args) {
    
    //Create object from base class: Food
    Food newFood = new Food("Kung pow chicken", "Spicy", 13.44);
    //Call function display() from base class: Food
    newFood.display();
    
    //Check wheather the food is spicy or not
    if (newFood.isSpicy())
      System.out.println(newFood.getName() + " is spicy.");
    else
      System.out.println(newFood.getName() + " is NOT spicy");
    
    System.out.println();//New line
      
    
    //–––2n Sub class : ChineseFood
    //Craete object from subclass: ChineseFood
    ChineseFood newChineseFood = new ChineseFood("Tofu", "Non-Spicy", 9.99, 2.0);
    //Call function display() from sub class: ChineseFood
    newChineseFood.display();
    
    //Check wheather the food is spicy or not
    if (newChineseFood.isSpicy())
      System.out.println(newChineseFood.getName() + " is spicy.");
    else
      System.out.println(newChineseFood.getName() + " is NOT spicy");
    
    System.out.println();//New line
    
    
    
    //–––3rd Sub class : Noodle
    //Craete object from 3rd subclass: Noodle
    Noodle newNoodle = new Noodle("Chaomian", "Spicy", 15.99, 300, "big");
    newNoodle.display();
    
    //Check wheather the food is spicy or not
    if (newNoodle.isSpicy())
      System.out.println(newNoodle.getName() + " is spicy.");
    else
      System.out.println(newNoodle.getName() + " is NOT spicy");
    
    //Show case overloading a method getPrice()
    System.out.println();//New line
    System.out.println("Price before discount: " + newNoodle.getPrice()); //getPrice() from class Food
    System.out.println("Price after discount: " + newNoodle.getPrice(0.8)); //getPrice(double discount) from class Noodle
  }
}

/*
Name: Kung pow chicken
Taste: Spicy
Price: 13.44
Kung pow chicken is spicy.

Name: Tofu
Taste: Non-Spicy
Price: 9.99
Calorie: 2.0
Tofu is NOT spicy

Name: Chaomian
Taste: Spicy
Price: 15.99
Calorie: 300.0
Size: big
Chaomian is spicy.

Price before discount: 15.99
Price after discount: 12.792000000000002
*/