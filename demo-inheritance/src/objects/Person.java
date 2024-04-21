package objects;

import java.util.Objects;

public class Person {
  
  private Dog dog;

  public Dog getDog(){
    return this.dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

 @Override
 public String toString(){
  return "Person(" //
    + "Dog=" + this.dog //
    + ")";
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (!(obj instanceof Person))
    return false;
  Person p = (Person) obj;
  return Objects.equals(this.dog, p.getDog());
 }

  public static void main(String[] args) {
    Person vincent = new Person();
    vincent.setDog (new Dog(1,Color.BLACK));

    Dog vincentDog1 = vincent.getDog();
    System.out.println(vincentDog1.getColor());

    vincent.setDog(new Dog(1,Color.RED));

    Dog vincentDog2 = vincent.getDog();
    System.out.println(vincentDog2.getColor());

    Person a = new Dog(); // upcasting
    
  }

}
