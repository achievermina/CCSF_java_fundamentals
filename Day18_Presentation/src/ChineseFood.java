public class ChineseFood extends Food{
  //Filed
  double calorie; // hold food calorie
  
  //Constructor1
  public ChineseFood() {
    super(); //Called Contrustor1 from base class: Food
    calorie = 0.0;
  }
  
  //Constructor2
  public ChineseFood(String newName, String newTaste, double newPrice, double newCalorie) {
    super(newName, newTaste, newPrice); //call the constructor from base class Food
    calorie = newCalorie;
  }
  
  //Method - define calorie
  public void setCalorie(double newCalorie) {
    calorie = newCalorie;
  }
  
  //Method - get value of calorie
  public double getCalorie() {
    return calorie;
  }
  
  //Override method display() from base class Food
  public void display() {
    super.display();
    System.out.println("Calorie: " + calorie);
  }
}