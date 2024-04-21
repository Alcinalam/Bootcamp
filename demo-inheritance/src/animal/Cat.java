package animal;

public class Cat extends Animal {

  // Child class Cat object inherit all instance variables, instance methods from Parent (Super) Class Animal object
  // but it does not inherit constructor

  public static String y = "DEF";

  private int age;

  private String name;

  private String catName;

  public Cat() {

  }

  public Cat(int age) {
    // Super(); // create Animal's constructor inside cat object
    this.age = age;
  }

  public Cat(int age, String name) {
    super(name);
    this.age = age;

  }

  public Cat(int age, String name, String catName) {
    // super(); // by default call super()
    super(name); // use one of the constructor of parent class
    this.age = age;
    this.catName = catName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Approach 1
  public String getCatName() {
    return this.catName;
  }

  public void setCatName(String name) {
    this.name = name;
  }

  // Approach 2
  public String getAnimalName() {
    return super.getName();
  }



  @Override
  public void sleep() { // Method signature is same as the Animal object Sleep()
    System.out.println("Cat is sleeping...");
  }

  public String upperX() {
    return Animal.x.toUpperCase();
  }



  public static void main(String[] args) {
    Cat cat = new Cat(10);
    cat.setName("Jenny");
    System.out.println(cat.getName()); // "Jenny"

    // new Animal
    Dog dog = new Dog();
    dog.setName("Ken");
    System.out.println(dog.getName());

    // Cat has its own instance variable
    cat.setAge(10);
    System.out.println(cat.getAge());

    // Another child class extends Animal

    // call sleep
    cat.sleep(); //

    Cat c2 = new Cat(2, "Alcina", "Meimei"); // super("Jenny")
    c2.setCatName("Ching");
    System.out.println(c2.getName());
    System.out.println(c2.getCatName()); // Meimei

    System.out.println(c2.getAnimalName());

    System.out.println("upper" + c2.upperX()); // ABC

    Animal a =  new Cat (10, "Jenny"); // 型態 Animal 包住cat
    
    Cat c = (Cat) a; // downcast 攞返cat 出嚟
    // System.out.println(a.getCatName());
    System.out.println(c.getCatName());
    
  }

}
