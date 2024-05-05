public record Person(String name, int age) {

  public static void main(String[] args) {
    // No empty constructor
    Person p1 = new Person("Vincent", 13);
    Person p2 = new Person("Vincent", 13);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode() == p2.hashCode());// true
  }
}
