package innerclass;

public class LocalOuterClass {

  private String surname;

  public LocalOuterClass(String surname) {
    this.surname = surname;
  }

  public void getAlt() {
    // create a class and use it immediately within method
    class LocalInnerClass {

      // String altname;
      String name1 = "Cherry ";
      String name2 = "Carmen ";

      private String getName1() {
        return name1.concat(surname);
      }

      private String getName2() {
        return name2.concat(surname);
      }

      void print() {
        System.out.println(getName1());
        System.out.println(getName2());
      }

    }
    LocalInnerClass li = new LocalInnerClass();
    li.print();

  }

  public static void main(String[] args) {
    LocalOuterClass outer = new LocalOuterClass("Chu");
    outer.getAlt();
  }


}
