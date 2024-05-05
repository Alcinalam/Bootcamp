public class Person {

  void read() {
    System.out.println("Class reading...");
  }

  public static void main(String[] args) {
    Person p1 = new Person();

    // overide class method in main: one-time use
    Person p2 = new Person() {
      @Override
      public void read() {
        System.out.println("p2 reading...");
      }
    };

    p1.read();
    p2.read();
  }
}
