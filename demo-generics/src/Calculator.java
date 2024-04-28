import java.math.BigDecimal;

public class Calculator<T extends Number> {

  private T x;
  private T y;

  public double sum3(T x, T y){
    return x.doubleValue() + y.doubleValue();
  }
  
  //1
  public static int sum(int x, int y) {
    return x + y;
  }

  //2
  public static double sum(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue(); //
  }

  // "<T extends Number>" implies x and y are the objects that
  // belongs to the class of Number's Type

  // 3
  // cannnot pass String object into the parameters x and y
  public static <T extends Number & Swim> double sum(T x, T y) { 
    // extends parents class or interface <can be extend more>
    // Number: Byte, Short, Integer, Long, Float
    return x.doubleValue() + y.doubleValue();
  }

  public static double sum2(Number x , Number y) { 
    return x.doubleValue() + y.doubleValue();
    //return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
    
    
  }

  public static void main(String[] args) {
    System.out.println(sum(2,3)); //5
    System.out.println(sum(2,3L)); //5.0
    System.out.println(sum(2,3.3d)); //5.3
    System.out.println(sum(2.3f,3.2d)); //5.499999952316284

    System.out.println(sum2(2,3)); //5.0
    System.out.println(sum2(2,3L)); //5.0
    System.out.println(sum2(2,3.3d)); //5.3
    System.out.println(sum2(2.3f,3.2d)); //5.499999952316284

    

    // compile time, limit the type ragne of x and y, so that x and y must be able to call doubleValue()
    // type Safety (compile time)

    // Run-time -> Polymorphism
    // sum(2.3f, 3.2d)
    // x.doubleValue() -> find the Float object in heap, we are calling the Float.doubleValue()

    //instance
    Calculator<Long> calculator = new Calculator<>();
    System.out.println(calculator.sum3(Long.valueOf(10),Long.valueOf(4))); // object 

    Calculator.sum(3.2d,3.4d); //static method

    Calculator.sum(new SuperLong(),new SuperLong()); //calling method 3
  }
}
