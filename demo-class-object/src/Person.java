public class Person {

  private int age;
  // private boolean isElderly; // don't have to define as age could use to check if they are Elderly

  // Constructor
  public Person () { // Empty Constructor
  }
  
  // constructor 有參數, 唔駛再setAge 同getAge
  public Person (int age) { // once constructor created, needa create Empty constructor too.
    this.age = age ;
  }

  // getter and setter for age
  public void setAge (int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }
  public boolean isElderly () {
    return this.age >= 65;
  }

  public String toString() {
    return "Person(" //
      + age //
      + ")";

  }
 
  public static void main(String[] args) {
    Person person = new Person(); // constructor
    person.setAge(65);
    System.out.println(person.isElderly()); // true

    Person person2 = new Person();
    person2.setAge(64);
    System.out.println(person2.isElderly()); // false

    Person p3 = new Person(3); // constructor 有參數, 唔駛再setAge 同getAge
    boolean result = p3.isElderly();
    boolean isElderly = new Person(65).isElderly();
    System.out.println(result); // false
    System.out.println(isElderly); // true
  }


}