package sport;

public interface Action {

  void run();
  void walk();
  // After Java 8
  default void swim(){ // child 自動有 instance method by inheriance
    System.out.println("Default method: swim...");
  
  }

  static void sleep(){ // 用class.名去dot normal static mthod, use interface name call
    System.out.println("Static method: sleep...");                   // not related to child class

  }

  public static void main(String[] args) {
    Action.sleep();
    Person p = new Person();
    p.swim();
    //p.sleep(); // NOT OK
  }
}
