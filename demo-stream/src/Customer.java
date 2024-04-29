import java.util.Objects;

public class Customer {
  
  private int age;
  private String name;

  public Customer (int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void SetAge (int age){
    this.age = age;
  }

  public void SetName (String name){
    this.name = name;
  }

 @Override
 public boolean equals (Object obj) {
  if (this == obj)
    return true;
  if (!(obj instanceof Customer))
    return false;
  Customer c = (Customer) obj;
  return Objects.equals(this.name, c.getName())
    && Objects.equals(this.age, c.getAge());
 }

 @Override
 public String toString() {
  return "Customer(" //
    + "age = " + this.age//
    + ", name=" + this.name //
    + ")";
 }


}
