public class DataType {
  public static void main(String[] args) {
    // variable 變量
    // integer 整數
    int x = 1200;// 只需要定義一次 datatype
    int age = 18;
    System.out.println(x);
    x = 200;
    System.out.println("x");
    System.out.println(x);
    int y = -30;
    y = 100;

    // x, y, age
    int sum = x + y + age;
    System.out.println(sum);

    int price = 8;
    int quantity = 10;
    int total = price * quantity;// 80

    int price2 = 10;
    int quantity2 = 4;
    int total2 = price2 * quantity2;

    // CamCase
    int averagePrice = (total + total2) / (quantity + quantity2);
    System.out.println(averagePrice);

    int a = 1;
    int b = 4;
    int c = a / b;
    System.out.println(c);// trim to int 不是4捨5入

    double k = 1.3;
    double k2 = 1.32;
    double k3 = 1;
    double k4 = -100;
    double k5 = 1.32343423425424352342342352342352342532432;// got limited
    System.out.println(k5);

    double k6 = 0.1 + 0.2;// 0.3
    System.out.println(k6); // 0.30000000000000004

    double k7 = 0.2 + 0.3;
    System.out.println(k7);// 0.5

    int u = 10 % 3; // 1
    System.out.println(u);// 1

    int h; // declaration
    h = 10;//initializaion
    System.out.println(h);

    //
    byte b1 = 10;
    byte b2 = 127;
    //byte b3 = 128;//compile time error (out of range)
    byte b4 = -128;
    //byte b5 = -129;//compile time error

    short s1 = 32767;
    short s2 = -32768;
    //short s3 = 32768;//compile time error
    //short s4 = -32769;//compile time error

    int i1 = 100;

    // Conversion
    long l1 = i1 + 100; //i1 + 100 ->int value -> long variable
    System.out.println(l1);//200

    // Java ensures type security, int size bigger than short-->error
    //short s4 = i1; //100

    short s5 = 10;
    //byte b10 = s5;
    byte b11 = 1;
    s5 = b11;

    double d3 = i1; //int ->double ok
    double d4 = 10.2;
    //i1 = d4; // double to int error

    float f3 = i1; //int ->to float
    //float f4 = 10.2;//10.2 is a double value by default (小數double)
    float f4 = 10.2f;//add f to define value as float
    //i1 = f4; //float->int 

    double d5 = 10.4; // 10.4 is double value by default
    double d6 = 10.4d;// you explicitly assign a double value

    int r1 = 10; // 10 is a int value by default
    byte b10 = 4; // for integer (number), java will help check the value, if it is in range. int ->byte
    //byte b12 = r1; //security problem -->error as r1 is int

        long l4 = i1; // in -> long
    long l5 = 5; // 5 is an int value by default
    //long l6 = 5i;
    long l6 = 10000; // 10000 is an int value
    long l7 = 10000L; //10000 is a long value

    long l8 = 2200000000; // out of int range 
    long l9 = 2200000000L; //

    // char (use single quote)
    char c1 = 'a';
    char c2 = '0';
    char c3 = '^';
    char c4 = ' ';
    char c5;
    //c5 = ''; // comile time error
    //char c6 = 'aa'; // allow single character only

    // boolean
    boolean b9 = true;
    boolean b12 = false;

    //boolean b13 = 'a';
    //boolean b14 = 10;

    // keyword
    //int true = 10; //NOT OK
    //eg. int long class public static etc
    int class1 = 19;

    //int h1 = 10 + 300L; // int value + long value -> 310 long value (error)
    long h2 = 10 + 300L; // int value + long value > 310 long value 

    



  }
}
