package shapes;

import java.math.BigDecimal;
import java.util.Arrays;

public interface Shape {
  // 100% abstraction -> No any implementation in interface
  // Interface is a contract that the class should implement it

  // No instance variable in interface
  // You can only define "public static final" variable in interface
  // public static final String s = "";
  String s = "hello"; // <-- must give a value as it is final
  BigDecimal PI = BigDecimal.valueOf(Math.PI);

  // Implicity public, no need write public, like a table of content
  double area();
  // final can't set, static autoget

  String print2();

  void print();

  // static method, with implementation class
  // public static double area(Square[] squares) {

  // }

  // public static double are(Circle[] circles){

  // }

  public static double area(Shape[] shapes) {
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes)
      sum = sum.add(BigDecimal.valueOf(shape.area()));
    return sum.doubleValue();
  }

  public static void value(Shape[] shapes) {
    for (int i = 0; i < shapes.length; i++) {
      System.out.print(shapes[i].getClass() + " : ");
      shapes[i].print();
    }
  }

  public static String value2(Shape[] shapes) {
    String[] result = new String[shapes.length];

    for (int i = 0; i < shapes.length; i++) {
      result[i] = shapes[i].print2();
      System.out.print(shapes[i].getClass() + " : " + result[i] );
    }
    return Arrays.toString(result);
  }




  public static void main(String[] args) {
    System.out.println(Shape.s);
    System.out.println(Shape.PI.doubleValue());// 3.141592653589793

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(10.0);
    shapes[1] = new Square(2.0);
    shapes[2] = new Circle(13.0);

    System.out.println(Shape.area(shapes));// 849.0884238156543
    Shape s1 = new Circle(34);
    s1.print();// 34
    Shape.value(shapes);
    Shape.value2(shapes);

  }
}
