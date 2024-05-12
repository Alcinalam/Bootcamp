import java.time.LocalDate;
import localdate.HKLocalDate;

public class Variables {

  private String name; // instance var
  private String surname;

  public static final int age = 18;

  // public static int getAge() {
  // return age;
  // }


  public Variables(String surname) {
    this.name = "peggy"; // initializing instance var
    this.surname = surname;
  }



  @Override
  public String toString() {
    return "var(" //
        + "name: " + this.name //
        + ", surname: " + this.surname//
        + ")";
  }


  public static void main(String[] args) {

    int var = 20; // local variable
    // local to this main method only
    System.out.println("Local var" + var);

    Variables human = new Variables("chur");
    System.out.println(human);

    System.out.println(LocalDate.now().getYear() - Variables.age);

    // int age = Variables.getAge();
    int age2 = age;
    System.out.println(age2);

  }
}
