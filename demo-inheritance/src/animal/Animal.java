package animal;
public class Animal {
  
  public static String x = "abc";
  
  private String name;

  public Animal (){

  }
  
  public Animal(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep(){
    System.out.println("sleeping");
  }

  public void run(){
    System.out.println("running");
  }

  public String lowerY() {
    return Cat.y.toLowerCase();
  }


  public static void main(String[] args) {
    Animal animal = new Animal ("mary");
    System.out.println(animal.lowerY()); //def
  }
}
