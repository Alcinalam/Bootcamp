package shapes;

import java.math.BigDecimal;

public class Circle implements Shape {
  
  // 1. You can implements more than one
  
  
  private double radius;

  public Circle (double radius){
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius) //
    .multiply (BigDecimal.valueOf(this.radius)) //
    .multiply (Shape.PI) //
    .doubleValue();
  }

  @Override
  public void print(){
    System.out.println(this.radius);
  }
  
  @Override
  public String print2() {
    return String.valueOf(this.radius);
  }
  @Override
  public String toString(){
    return "Circle(" //
      + ", radius=" + this.radius //
      + ")";
  }
  
  public void sleep(){
    System.out.println("sleep");
  }
  

  public static void main(String[] args) {
    // Polymorhism
    Shape s = new Circle(10); // ok
    s.area();
    s.print();
  }


  
}
