import java.util.Arrays;

public class DemoMethodArray {
  public static void main(String[] args) {
    double [] prices = new double [] {2.0, 9.8, 5.6};
    int [] quantities = new int [] {2, 2, 5}; 

    double totalAmount = total(prices, quantities);
    System.out.println("TotalAmount = " + totalAmount); // 

    // class 名 Start with Captal letter
    // call out, 先用publc class名, 再.static method的名 可以call到其他Class. 
    double amount = DemoMethodArray.total(prices,quantities);

    String [] test = new String [] {"a a a","bb b"};
    String [] test2 = trimSpace(test);
    System.out.println(Arrays.toString(test2));//[aaa,bbb]
    
    }

    public static Integer sum(Integer x, Integer y){ // pass by value(all other wrapper class and primitive in method)
      return x + y; // int + int -> int -> autobox
    }

    public static String trimSpace(String s) { // pass by value (a copy of the original string object)
      return s.replace (" ", "");
    }

  // return {"aaa","bbb"}
    public static String[] trimSpace(String[] ss) { // pass by reference (address)/object
      String [] strings = new String[ss.length];
      for (int i = 0 ; i < strings.length; i++) {
        strings[i] = ss[i].replace(" ","");
      }
      return strings;  //returning string array object address
    }


  // Method: totalAmount -> call subTotal()
    public static double total (double[] prices, int[] quantities) {
      double totalAmount = 0.0d;
      for (int i = 0; i < prices.length; i++) {
        totalAmount += subTotal(prices[i], quantities [i]);
      }
      return totalAmount;
    }
 
  // Method : subTotal(double price, int quantity)
    public static double subTotal (double price, int quantity) {
      return price * quantity;
  }



}
