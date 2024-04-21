package exercise;

// Exercise is combine interface with interface Run and interface Walk
// Work is another interface
public class Person implements Exercise, Work {

  @Override
  public void run() {

  }

  @Override
  public void walk() {
    
  }

  @Override
  public void work() {
   
  }

  @Override
  public void swim() {
    
  }
  
  public static void main (String [] args) {
    Run vincent = new Person();
    vincent.run();

    Walk vincent2 = new Person();
    vincent2.walk();
    Person p = (Person) vincent2;
    p.run();
    p.walk();
    p.swim();

    Exercise vincent3 = new Person(); 
    vincent3.run();
    vincent3.walk();
    vincent3.swim();
    // vincent3.work(); work not included in Exercise interface
  }
}
