public class BootCampException extends Exception {
  // "extends Exception" implies "BootcampException" is a checked exception
  // because Exception.class is a checked exception

  public static void main(String[] args) throws BootCampException { // throw JVM
    try {
      calculate(10, 0);
    } catch (BootCampException e) {
    }

  }


  public static int divide(int x, int y) {
    return x / y; // if y= 0, JVM will throw an object of ArithmeticException
  }

  public static void calculate(int x, int y) throws BootCampException { // Solution 1
    try {
      divide(x, y);
      // .... throw IAE
    } catch (ArithmeticException | IllegalArgumentException e) {
      throw new BootCampException();
      // because it is a check expection, so we need to handle it before compilation
    }
  }


}
