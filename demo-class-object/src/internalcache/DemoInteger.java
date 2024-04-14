package internalcache;

public class DemoInteger {

  public static void main (String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1 == i2); //true
    System.out.println(System.identityHashCode(i1)); //1523554304
    System.out.println(System.identityHashCode(i2)); //1523554304

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3 == i4); // false
    System.out.println(System.identityHashCode(i3)); //1175962212
    System.out.println(System.identityHashCode(i4)); //918221580

    // Integer, Byte, Long, Short -> support Internal Cache
    // Float, Double -> do not support internal cache

    Float f1 = Float.valueOf(127); // int -> float
    Float f2 = Float.valueOf(127); // int -> float
    System.out.println(f1 == f2); // false
    System.out.println(System.identityHashCode(f1)); //2055281021
    System.out.println(System.identityHashCode(f2)); //1554547125

    Character c1 = Character.valueOf('z');
    Character c2 = Character.valueOf('z');
    System.out.println(c1 == c2); // true

    Character c3 = Character.valueOf ('無');
    Character c4 = Character.valueOf ('無');
    System.out.println(c3 == c4); // false
    
  }

  
  
}
