package sport;

public class Person implements Action {

  @Override
  public void run() {
    System.out.println("run ....");
  }
  
  @Override
  public void walk() {
    System.out.println("walk ....");
  }

  // Override default method on interface (Action)
  @Override
  public void swim(){
    System.out.println("person is swiming...");
  }

  // can have their own method
  public void talk(){
    System.out.println("person is talking...");
  }

public static void main(String[] args) {
  Action a = new Person();
  //a.cry();// compile error, Action Type does not have cry() method.
  
}
  
}
