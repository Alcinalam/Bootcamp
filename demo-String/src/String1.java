// java : compile language : java file (test.java)-> compilation -> class file (byte code - test.class)
// 
//"String" is a key word in Java.
public class String1 {
  public static void main(String[] args) {
    int x = 0;
    char c2 = 's'; //store single cha



    String y = "hello world!";
    String s = "1";
    // int sum = y + s not work

    String s3 = ""; // empty string
    String s4 = " "; // space

    // Tool for String
    // length()
    int length0fY = y.length(); //12
    System.out.println(y.length());

    // CharAt()
    char character = y.charAt(2); // l

    System.out.println(y.charAt(0));
    //System.out.println(y.charAt(100)); // runtime error
    
    // equals() return boolean
    String s1 = "hello";
    String s2 = "hello";

    boolean isS1EqualsToS2 = s1.equals(s2);
    System.out.println(isS1EqualsToS2); // true

    // concat
    String s5 = s1 + s2; // hellohello
    System.out.println(s5); // hellohello
    // -, *,/ are not allowed for String

    // 有一個String 相加就可以變String
    System.out.println(s5 + 10); // String + int -> String + String
    System.out.println(s5 + 'a'); // String + char -> String + String
    System.out.println(s5 + true); //hellohellotrue

    String j = "hello" + true;
    // String j2 = 10 + 10; // int + int -> int (can't convert to string)

    String s7 = "world";
    s7 += "!";
    
    System.out.println(s7); // world!
    System.out.println(s7.contains("o"));
  }
}
