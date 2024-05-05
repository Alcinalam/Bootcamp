public class Test {

  public static void main(String[] args) {
    Outer o1 = new Outer();
    // System.out.println(o1.x); // object.class instance var, not within same class

    // System.out.println(Outer.y); // class.class static var, not within same class

    Outer.getY();
    // getY();
    // need use class name to get,
    // or could only use inside Outer class

    // new static class object
    Outer.StaticNested o2 = new Outer.StaticNested();
    // Outer.StaticNested o2 = new StaticNested(); // same as above coz in same class
    o2.print(); // hello

    // new Inner class object with Outer object
    // Outer o3 = new Outer();
    // Outer.Inner i = o3.new Inner(); // one outer could new many inner object
    // Outer.Inner i1 = o3.new Inner();
    Outer.Inner o4 = new Outer().new Inner(); // combine above two lines
    o4.print(); // hello2



  }
}
