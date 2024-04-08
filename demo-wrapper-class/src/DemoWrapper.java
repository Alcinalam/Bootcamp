public class DemoWrapper {
    public static void main(String[] args) {
       int x = 1; // +,-.*,/,%
       Integer x2 = 1; // Integer wrapper class --> object (i.e. String.class -> String object)
       Integer x3 = new Integer("1");
       Integer x4 = Integer.valueOf(123);

       char c = 'a';
       Character c2 = 'a';
       Character c3 = new Character('a');
       Character c4 = Character.valueOf('a');

       byte b = 1;
       Byte b1 = 1;
       Byte b3 = new Byte("1");
       

       short s = 1;
       Short s1 = 1;
       Short s2 = new Short("1");
       

       long l = 1;
       Long l1 = 1L ;
       Long l2 = new Long("1");
       Long l3 = Long.valueOf(12);

       float f = 0.1f;
       Float f1 = 0.1f;
       Float f3 = new Float("0.1f");
       
       double db1 = 12;
       Double db2 = 12d;
       Double db3 = new Double(12d);
       Double db4 = Double.valueOf(12); 

       boolean bl = true;
       Boolean bl1 = true;
       Boolean bl2 = new Boolean("true");
       Boolean bl3 = Boolean.valueOf(false);

       if (x2.equals(1)){
        System.out.println("x2=1");
       }
       if (x2 == 1){
        System.out.println("x2=1");
       }
       x2 = 128;
       if (x2 == 128){
        System.out.println("x2=128");
       }

       //-128 to 127 (within range, will point to the same object)
       Integer num1 = Integer.valueOf(127); //valueOf() --> "new" a Integer object
       Integer num2 = Integer.valueOf(127); 
       // "==" is checking if they are same object (same address)
       System.out.println(num1 == num2); // true
       // equals () is checking if they are with same value
       System.out.println(num1.equals(num2)); // true

       Integer num5 = new Integer(127); // (by create with new)
       System.out.println(num1 == num5); // false


       Integer num3 = Integer.valueOf(128);
       Integer num4 = Integer.valueOf(128);
       // "==" is checking if they are same object (same address)
       System.out.println(num3 == num4); // false
       // equals () is checking if they are with same value
       System.out.println(num3.equals(num4)); //true

       String str = "hello";
       String str2 = "hello";
       String str3 = new String ("hello");
       String str4 = String.valueOf("hello");
       // "==" check object
       System.out.println(str == str2); // true , if value the same, auto use same object
       System.out.println(str == str3); // false, by create with new
       System.out.println(str == str4); // true
       System.out.println(str.equals(str2)); // true
       System.out.println(str.equals(str3)); // true

       Double d2 = 1.0;
       Double d3 = new Double ("1.0");
       Double d4 = Double.valueOf(1.0);
       System.out.println(d2==d3);// false
       System.out.println(d2==d4);// false
       System.out.println(d2.equals(d3));// true
       System.out.println(d2.equals(d4)); // true

       System.out.println(d2.compareTo(d3));// 0

       // 17 Types + array
       
       //assign int value 3 to Integer variable
       Integer i1 = 3; // 3 (int value) --> Integer Object with value 3 --> auto-box
       int i2 = i1; // il (Integer Object) --> unbox

       Character c5 = 'c'; //autobox
       char c6 = c5; // unbox

       System.out.println(c5.compareTo(c6));

       Integer i3 = 10;
       long l4 = i3; // integer --> int (unbox) --> long (upcast) 
       // short s4 = i3; // integer --> int(unbox) --> short (un-secure)

       int i5 = 12;
       Long l5 = (long) i5; // int --> long (upcast) --> Long (autobox) 要主動變long value
    
    // Float.valueOf()
    Float f2 = Float.valueOf("1.0");
    // f2.compareTo() -> 1,-1,1
    // f2.equals(...) -> true, false
        
    
    
    
    }
}
