public class BCList<T, U> { // compile time need set which type as on line 28 or line 34
  // if T, T (type need to be the same)

  private T data1; // eg. Queue<T> data;
  private U data2;

  public BCList(T data1, U data2) {
    this.data1 = data1;
    this.data2 = data2;
  }

  public T getData1() {
    return this.data1;
  }

  public U getData2() {
    return this.data2;
  }

  public static <T extends Number> double sum (T number1, T number2){ 
    // relationship to line 1 ? no, as static method
    System.out.println(number1.getClass()); // Integer
    System.out.println(number2.getClass()); // Long
    return number1.doubleValue() + number2.doubleValue();
  }
  

  public static void main(String[] args) {
    BCList<String, Integer> bclist = new BCList<>("hello", 12); 
    // instance one need define type, so the type need were setted
    System.out.println(bclist.getData1());
    System.out.println(bclist.getData2());

    // T and U can be same type
    BCList<String, String> bclist2 = new BCList<>("abc", "xxx");
    System.out.println(bclist2.getData1());
    System.out.println(bclist2.getData2());

    // "public class BCList <T,T>" -> two attributes must be same type
    
    // signature <T extends Number> double sum (T number1, T number2)
    sum(Integer.valueOf(13), Long.valueOf(20));

    // int -> Integer (autobox)
    // integer -> int (unbox)
    // int -> long (upcast)
    // long -> int (downcast => overflow)

    // Wrapper Class cannot be converted between each others
    // Integer -> Long (no auto or dirct relationship, no conversion)
    // Long -> Integer (no auto or dirct relationship, no conversion)




  }
}


