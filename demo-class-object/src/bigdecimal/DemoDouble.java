package bigdecimal;

import java.math.BigDecimal;

public class DemoDouble {
  public static void main(String[] args) {
    double result = 0.1d + 0.2d;
    System.out.println(result); // 0.30000000000000004

    BigDecimal bd1 = new BigDecimal("0.1"); // need to use string to put in
    BigDecimal bd2 = bd1.add(new BigDecimal("0.2"));
    System.out.println(bd2.doubleValue()); // 0.3

    double d1 =
        BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println("d1=" + d1); // 0.3

    double d2 = 
        BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(4.3)).doubleValue();
    System.out.println("d2=" + d2); // 0.43

    double d3 = 
        BigDecimal.valueOf(8.4).subtract(BigDecimal.valueOf(2.2)).doubleValue();
    System.out.println("d3=" + d3); //6.2

    double d4 =
        BigDecimal.valueOf(22).divide(BigDecimal.valueOf(7)).doubleValue();
    System.out.println("d4=" + d4); //Non-terminating decimal expansion

   

  }

}
