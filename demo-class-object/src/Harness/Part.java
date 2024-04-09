package Harness;

import java.math.BigDecimal;
import java.util.Arrays;

public class Part {

  private String partName;

  private double unitCost;

  private int usage;

  public Part(String partName, double unitCost, int usage) {
    this.partName = partName;
    this.unitCost = unitCost;
    this.usage = usage;
  }

  public String toString() {
    return "Part(" //
      + "partName= " + this.partName//
      + ", unitCost= " + unitCost //
      + ", usage=" + usage //
      + ")" ;
  }

  public double partCost() {
    return BigDecimal.valueOf(this.unitCost) //
        .multiply(BigDecimal.valueOf(this.usage)) //
        .doubleValue();

  }

  public static void main(String[] args) {
    Part parts1 = new Part("seat terminal",3.5, 10);
    Part parts2 = new Part ("seat connector" , 0.5, 250);
    Part parts3 = new Part ("seat wire" ,10, 700);

    BomList L1 = new BomList("B1");
    L1.add(parts1);
    L1.add(parts2);
    L1.add(parts3);
    
    Harness h1 = new Harness("Seat Harness 234");
    h1.add(L1);
    System.out.println(h1);
    System.out.println("Cost: " + L1.harnessCost());


  

    
    
  }


}
