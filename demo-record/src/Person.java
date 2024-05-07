public record Person(String name, int age) {


  public Person(String name, int age) {
    if (age < 0 || name == null) {
      throw new IllegalArgumentException("please check your input");
    }
    this.name = name;
    this.age = age;
  }


  public static void main(String[] args) {
    // No empty constructor
    // Person p = new Person("Vincent", -4);
    Person p1 = new Person("Vincent", 13);
    Person p2 = new Person("Vincent", 13);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode() == p2.hashCode());// true

  }
}
