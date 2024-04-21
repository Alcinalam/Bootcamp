package math;

public class DemoMath {
  
  public static void main (String[] args) {
    // Math.pow()
    Math.pow(1,2) ; // upcast: 1 -> double
    double result = Math.pow (2.0d,3);
    System.out.println(result); // 8

    int a = 10;
    int b = 9;
    int min = Math.min(a,b);
    System.out.println("min=" + min);

    if (a > b)
      min = b;
    min = a;

    int max = Math.max (a,b);

    if (a > b) {
      max = a; 
      } else {
        max = b;
      }
    
      double data = Math.abs(-3.2);
      double r = Math.abs(data);
      System.out.println("data=" + data);

      if (data < 0) {
        r *= -1;
      }
      System.out.println(Math.round(3.45)); // 3
      System.out.println(Math.round(3.50)); // 4 (round 做整數)

      System.out.println(Math.sqrt(9.0)); // 3.0
      System.out.println(Math.sqrt(9.1)); // 3.0166206257996713
      System.out.println(Math.sqrt(-9.0)); // double ->NaN

      System.out.println("ceil=" + Math.ceil(3.1)); // 4
      System.out.println("floor=" + Math.floor(3.7)); // 3

      double radian = 3.3333;
      Math.sin(radian);
      double sinValue = Math.sin(radian);
      double cosValue = Math.cos(radian);
      double tanValue = Math.tan(radian);

      // Find Max Value in an int array
      int[] arr = new int [] {10, 4, 20, 3};
      
      int maxx = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        maxx = Math.max(arr[i],maxx);
      }
      System.out.println("maxx=" + maxx); // 20

      int minn = Integer.MAX_VALUE;
      for (int i = 0 ; i < arr.length; i++ ){
        minn = Math.min(arr[i],minn);
      }
      System.out.println("minn=" + minn); //3

  }
}
