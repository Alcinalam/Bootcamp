import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> { // 1st ball is this, <compare thing>

  private Color color;
  private double size;

  public Ball(Color color, double size) {
    this.color = color;
    this.size = size;
  }

  public double getSize() {
    return this.size;
  }

  public Color getColor() {
    return this.color;
  }

  // @Override
  // public int compareTo (Ball b) { // -1(細過0) 把this的element 向前move or keep /left
  // // this, b ->int
  // if (this.size > b.getSize()){
  // return -1;
  // }
  // return 1;
  // //return this.size > b.getSize() ? -1 : 1;
  // }

  // @Override
  // public int compareTo(Ball b) {
  //   return this.color == Color.YELLOW ? -1 : 1;
  // }

  @Override
  public int compareTo(Ball b) {
    if (this.color == Color.YELLOW)
      return -1;
    if (this.color.name().charAt(0) > b.getColor().name().charAt(0))
    return -1;
    else if (this.color.name().charAt(0) < b.getColor().name().charAt(0))
    return 1;
    return this.size > b.getSize() ? -1 : 1;
  }

  // @Override
  // public int compareTo(Ball b) {
  //   if (this.color == Color.YELLOW)
  //     return -1;
  //   return this.color.name().charAt(0) == b.getColor().name().charAt(0)
  //    && this.size > b.getSize() ? -1 : 1;
  // }

  @Override
  public String toString() {
    return "Ball(" //
        + "size=" + this.size //
        + ", color=" + this.color //
        + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add (new Ball(Color.YELLOW,9d));
    balls.add (new Ball(Color.RED,8.4d));

    Collections.sort(balls); // Compile-time check if the list of the object implements a contract "Comparable", 
    System.out.println(balls);
    
    
  }
}
