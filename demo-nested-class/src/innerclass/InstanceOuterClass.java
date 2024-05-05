package innerclass;

public class InstanceOuterClass {

  private String name = "Kelly";
  private static String ID = "1234";


  public class InnerClass { // 只係同一個class 用先放入去
    void print() {
      System.out.println(name);
      System.out.println(ID);
      // System.out.println(this.name);
      // NOT OK, this.x is Outer object, now in Inner
    }

  }

  public static void main(String[] args) {
    // Outer object -> outer. new Inner object
    InstanceOuterClass outer = new InstanceOuterClass();
    InstanceOuterClass.InnerClass inner = outer.new InnerClass();
    inner.print();
  }
}
