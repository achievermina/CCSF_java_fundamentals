public class Food {
  //Fields
  private String name, //Hold value of food name
                 taste; //spicy or non-spicy
  
  private double price;
  
  //Contrustor1
  public Food() {
    this("No name yet", "No taste yet", 0.0); //Called contructor2 as below
  }
  
  //Contrustor2
  public Food(String newName, String newTaste, double newPrice) {
    name = newName;
    taste = newTaste;
    price = newPrice;
  }
  
  //Method - define name
  public void setName(String newName) {
    name = newName;
  }
  //Method - define taste
  public void setTaste(String newTaste) {
    taste = newTaste;
  }
  
  //Method - define price
  public void setPrice(double newPrice) {
    price = newPrice;
  }
  
  //Method - get value of name
  public String getName() {
    return name;
  }
  
  //Method - get value of taste
  public String getTaste() {
    return taste;
  }
  
  //Method - get value of price
  public double getPrice() {
    return price;
  }
  
  //Display
  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Taste: " + taste);
    System.out.println("Price: " + price);
  }
  
  //Check wheather the food is spicy or not
  public Boolean isSpicy() {
    return taste.equalsIgnoreCase("Spicy");
  }
    
}