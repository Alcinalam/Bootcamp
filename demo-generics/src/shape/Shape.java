package shape;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface Shape {
  // attribute
  double area();

  // default method --> instance method

  // static method
  static double area(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d); // bd is a local variable, Java -> auto GC
    for (Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  
  static <T extends Shape> double area2(List<T> shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) {
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  // Polymorphism -> data Structure
  static <T extends Collection<Number>>double area3(T shape){  // collection of Number, 只睇Collection
    //Queue<Number>
    //Set<Number>
    //List<Number>
    return -1;
  }

  // Polymorphism -> type (Approach 1)
  static <T extends Number> double area4 (Queue<T> shape){ // 
    // Queue<Long>
    // Quene<Short>
    return -1;
  }

  // Polymorphism -> type (Approach 2)type
  static double area5(Queue<? extends Number> shape) {
    // Queue<Long>
    // Quene<Short>
    return -1;
  }

  static double area6(Queue<? super Long> shape){
    return -1;
  }

  public static void main(String[] args) {
    Circle c = new Circle(3.0d);
    Square s = new Square(5.0d);
    List<Shape> shapes = new LinkedList<>();
    shapes.add(c);
    shapes.add(s);

    List<Object> shape2 = new LinkedList<>();//咩TYPE都可以, 出返嚟要變type/domain
    shape2.add(c);
    shape2.add(s);
    shape2.add(new Object());

    for (Object o : shape2){
      // o.area();
      // instanceOf
    }

    List<Object> objects = new LinkedList<>();
    objects.add(new Circle(4.5d));
    // Shape.area2(objects); // compile error ,
    // because Method signature (<T extends Shape> not //
    // compatiable to List<Object>;

    Queue<Long> ql = new LinkedList<>();

    Queue<Number> qn =  new LinkedList<>();
    qn.add(1L);
    Shape.area3(qn);
    
    Set<Number> sn =  new HashSet<>();
    sn.add(2L);
    Shape.area3(sn);

    Queue<Long> ql1 = new LinkedList<>();
    ql1.add(4L);
    Shape.area4(ql1);

    Queue<Long> ql2 = new LinkedList<>();
    ql2.add(4L);
    Shape.area5(ql2);

    Shape.area6(ql);
    Queue<Short> qs = new LinkedList<>();
    // Shape.area6(qs); // compile error,<? super Long>

    Queue<Number> qn2 = new LinkedList<>();// define as Number to add
    Shape.area6(qn2);


  }
}
