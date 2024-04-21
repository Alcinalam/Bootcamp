package abstracts;

public final class SuperCat extends SuperAnimal { //final class cannot have another child class

  private int age;

  public SuperCat (String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public void sleep () {
    System.out.println("Cat is sleeping");
  }

  public void run(){
    System.out.println("cat is running");
  }

  @Override
  public void eat(){
    System.out.println("cat is eating");
  }

  @Override
  public void sit(){
    System.out.println("Cat is siting on the floor...");

  }

  // @Override
  // public void swim(){ // cannot override as Super class final it

  // }

  public static void main(String[] args) {
    SuperCat sc = new SuperCat("Jenny",3);
    System.out.println(sc.getName());
    System.out.println(sc.getAge());
    sc.run();
    sc.sleep();
    sc.eat();
    sc.sit();
    sc.swim();

    SuperCat sc2 = sc;
    System.out.println(sc2 == sc); // true
    System.out.println(sc2.equals(sc)); //true
  }
  
}
