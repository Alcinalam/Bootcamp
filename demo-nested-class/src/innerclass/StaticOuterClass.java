package innerclass;

public class StaticOuterClass {

  private String name = "Sammi";
  private static String ID = "1234";


  public static class StaticNestedClass {
    void print() {
      // System.out.println(name);
      // static member cannot access Outer class instance var
      System.out.println(ID);

    }
  }

  public static void main(String[] args) {
    //
    StaticOuterClass.StaticNestedClass snested = new StaticNestedClass();
    snested.print();
  }
}
