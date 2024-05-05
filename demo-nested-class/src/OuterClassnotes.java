public class OuterClassnotes {
  private int x = 10;

  private static int y = 100;

  public int getX() {
    return this.x;
  }

  public static int getY() {
    return y;
  }

  public void print() {
    class LocalInner { // 2b. Local Inner Class
      int x;

      LocalInner(int x) {
        this.x = x;
      }

      void print() {
        System.out.println("hello3" + this.x);
      }
    }
    LocalInner li = new LocalInner(20);
    li.print(); // 20
  }

  public static class StaticNested { // 1. static Nested Class (Static member of Outer Class)
    void print() {
      System.out.println("hello" + y);
      // System.out.println("hello" + x ); // static member cannot access outer object instance var.x
    }
  }

  public class Inner { // 2.Inner Class (non-static) (instance member of Outer Class)
    void print() {
      System.out.println("hello2" + x);// OK
      System.out.println("hello2" + y);// OK
      // System.out.println("hello2" + this.x);
      // NOT OK, this.x is Outer object, now in Inner
    }
  }


  public static void main(String[] args) {
    OuterClassnotes o1 = new OuterClassnotes();
    System.out.println(o1.x); // 10

    System.out.println(OuterClassnotes.y); // 100

    OuterClassnotes.getY();
    getY();

    // new static class object
    OuterClassnotes.StaticNested o2 = new OuterClassnotes.StaticNested();
    // Outer.StaticNested o2 = new StaticNested(); // same as above coz in same class
    o2.print(); // hello

    // new Inner class object with Outer object
    // Outer o3 = new Outer();
    // Outer.Inner i = o3.new Inner(); // one outer could new many inner object
    // Outer.Inner i1 = o3.new Inner();
    OuterClassnotes.Inner o4 = new OuterClassnotes().new Inner(); // combine above two lines
    o4.print(); // hello2

    // call inner method
    OuterClassnotes o6 = new OuterClassnotes();
    o6.print(); //

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
    vincent.drive();
    vincent.abc();
  }
}
