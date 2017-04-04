package Garden;

/**
 * Created by georgezsiga on 4/4/17.
 */
public class Tree extends Garden {

  public Tree(String color, Double waterAmount) {
    this.color = color;
    this.waterAmount = waterAmount;
  }

  public void wateringTree(Double wateringAmount) {
    if (waterAmount < 5) {
      waterAmount = waterAmount + (wateringAmount*0.75);
    }
  }
}