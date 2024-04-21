package shapes;

import java.math.BigDecimal;

public class Square implements Shape {

  private double length;

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length) //
        .multiply(BigDecimal.valueOf(this.length)) //
        .doubleValue();
  }

  @Override
  public void print() {
    System.out.println(this.length);
  }

  @Override
  public String print2() {
    return String.valueOf(this.length);
  }

  @Override
  public String toString() {
    return "Square(" //
        + ", length=" + this.length //
        + ")";
  }

}
