public class UncheckedException {

  public static void main(String[] args) {

    // 1. IllegalArgumentException

    int total = 0;
    try {
      total = totalSalary(new int[] {100, -10, 45});
    } catch (IllegalArgumentException e) {
      // total = 0;
      System.out.println("NG-IllegalArgumentException");
    }
    System.out.println("total salary=" + total);

    // 2. ArithmeticException:
    try {
      int a = 30, b = 0;
      int c = a / b;
      System.out.println(c);// java.lang.ArithmeticException: / by zero
    } catch (ArithmeticException e) {
      System.out.println("NG-Arithmetic");
    }

    // 3. ArrayIndexOutOfBoundsException:

    // Example 1: 
    try {
      int[] a = new int[5];
      a[6] = 9;
      System.out.println(a); // ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("NG-ArrayIndexOutOfBounds");
    }

    // Example 2: 
    try{
      System.out.println(getString(new char[] {'c', 'a', 't'}, -1, 2));
    // ArrayIndexOutOfBoundsException: Index -2 out of bounds for length 3
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("NG-ArrayIndexOutOfBoundsException");
    }

    // 4. NullPointerException
    String s = "hello";
    s = null;
    //System.out.println(s.charAt(0));
    //NullPointerException: Cannot invoke "String.charAt(int)" because "s" is null

    // Solution with catch, not suggested
    try{
      System.out.println(s.charAt(0));
    } catch (NullPointerException e) {
      // Nothing could be fix 
    }

    // Solution 2
    if (s != null)
    System.out.println(s.charAt(0));
    
 
    // 5. StringIndexOutOfBoundsException
    String s2 = "o";
    try{
      System.out.println(s2.charAt(5));
    //StringIndexOutOfBoundsException: String index out of range: 5
    } catch (StringIndexOutOfBoundsException e) {
      // do sth
    }

    // 6. IllegalStateException
    int n1 = 7; 
    int n2 = -8;
    try{
      checkParameters(n1, n2);
    } catch  (IllegalStateException e){
      System.out.println("NG-IllegalStateException");
    }

    // 7. NumberFormatException
    try {
      int num = Integer.parseInt("K11");
      //NumberFormatException: For input string: "K11"
      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println("NG-NumberFormatException");
    }



  }

 
  public static int totalSalary(int[] arr) {
    int sum = 0;
    for (int x : arr) {
      if (x < 0) {
        throw new IllegalArgumentException ();
      }
      sum += x;
    }
    return sum;
  }

  // ArrayIndexOutOfBoundsException
  public static String getString(char[] characters, int beginIndex,
      int endIndex) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIndex; i < endIndex - 1; i++) {
      sb.append(characters[i]);
    }
    return sb.toString();
  }

  public static void checkParameters(int n1, int n2) {
    if (n1 + n2 > 0)
      System.out.println("It is correct state");
    if (n1 * n2 >100)
      System.out.println("It is correct state");
    throw new IllegalStateException();
  
  }

}
