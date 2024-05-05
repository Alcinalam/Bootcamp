public class Outer {
  private String x = "class instance x";

  private static String y = "class static y";

  public String getX() {
    return this.x;
  }

  public static String getY() {
    return y;
  }

  public void print() {
    class LocalInner { // 2b. Local Inner Class
      String x;

      LocalInner(String x) {
        this.x = x;
      }

      void print() {
        System.out.println("Local Inner Class = " + this.x);
      }
    }
    LocalInner li = new LocalInner("Local inner new var");
    li.print(); //
  }

  public static class StaticNested { // 1. static Nested Class (Static member of Outer Class)
    void print() {
      System.out.println("static nested class = " + y);
      // System.out.println("hello" + x ); // static member cannot access outer object instance var.x
    }
  }

  public class Inner { // 2.Inner Class (non-static) (instance member of Outer Class)
    void print() {
      System.out.println("instance inner class = " + x);// OK
      System.out.println("instance inner class = " + y);// OK
      // System.out.println("hello2" + this.x);
      // NOT OK, this.x is Outer object, now in Inner
    }
  }


  public static void main(String[] args) {
    Outer o1 = new Outer();
    System.out.println(o1.x); // object.class instance var [class var]

    System.out.println(Outer.y);// class.class static var [static var]

    System.out.println("Outer.getY()" + Outer.getY());
    System.out.println("getY()" + getY());

    // new static class object
    Outer.StaticNested o2 = new Outer.StaticNested();
    // Outer.StaticNested o2 = new StaticNested(); // same as above coz in same class
    o2.print(); // [static nested classstatic var]

    // new Inner class object with Outer object
    // Outer o3 = new Outer();
    // Outer.Inner i = o3.new Inner(); // one outer could new many inner object
    // Outer.Inner i1 = o3.new Inner();
    Outer.Inner o4 = new Outer().new Inner(); // combine above two lines
    o4.print(); // [instance inner classclass var]

    // call inner method
    Outer o6 = new Outer();
    o6.print(); // [Local Inner ClassLocal inner Var]

    // before java 8 (before lambda)
    Drivable vincent = new Drivable() {
      @Override
      public void drive() {
        System.out.println("interface + driving method...");
      }

      @Override
      public void abc() {
        System.out.println("interface + abc method...");
      }
    };
    vincent.drive();// [interface + driving method...]
    vincent.abc();// [interface + abc method...]
  }
}
