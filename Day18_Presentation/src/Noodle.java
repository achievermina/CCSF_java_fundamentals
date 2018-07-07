public class Noodle extends ChineseFood {
  //Fields
  String size; //Small size or medium size or big size
  
  //Contructor1
  public Noodle() {
    super(); // Called contructor from base class: ChineseFood
    size = "No size yet";
  }
  
  //Contrustor2
  public Noodle(String newName, String newTaste, double newPrice, double newCalorie, String newSize) {
    //Call the contructor from bass class ChineseFood
    super(newName, newTaste, newPrice, newCalorie);
    size = newSize;
  }
  
  public void setSize(String newSize) {
    size = newSize;
  }
  
  public String getSize() {
    return size;
  }
  
  /*Overload method getPrice() from class Food
    Previously, there is no parameter. When we create getPrice, we will add parameter*/
  public double getPrice(double discount) {
    return getPrice() * discount; //variable price is priavate, so use getPrice() to get value
  }
  
  //Override method display() from base class Food
  public void display() {
    super.display();
    System.out.println("Size: " + size);
  }
  
}