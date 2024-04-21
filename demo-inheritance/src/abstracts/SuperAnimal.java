package abstracts;

public abstract class SuperAnimal extends SuperObject { // 1. you cannot create an object for an abstract class SuperAnimal

  private String name;

  public SuperAnimal(){ // 2. Abstract class is still having a constructor, even you cannot create an object.for super

  }

  public SuperAnimal (String name) {
    this.name = name;
  }


  public String getName(){
    return this.name;
  }
  
  public void setName (String name) {
    this.name = name;
  }

  public abstract void eat(); // 3. Abstract method signature,  extends/child class need implement this method 

  // 4. Automatically inherits abstract method from parent abstract class

  public void sleep (){
    System.out.println("Animial is sleeping");
  }

  public void run() {
    System.out.println("Animal is running");
  }

  public final void swim(){ // child cannot override
    System.out.println("Animal is swimming...");
  }

  public static void main (String[]args) {
    // superAnimal sa = new SuperAnimal();
  }
}
