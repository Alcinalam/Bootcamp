public class Dog {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setAge(8);
    dog.setFirstName("John");
    dog.setLastName("Lau");
    System.out.println(dog.toString()); // "Dog(firstName=John, lastName=Lau, age=8)"
    System.out.println(dog.fullName()); // John Lau

    Dog dog2 = null;
    // dog2.setAge(4); // rules is okay, cannot run( NPE: null pointer exception )
    Dog dog3 = new Dog();
    dog3.setAge(15); // dog3. the "dot" is to find the object, the method
  }

  private String firstName;
  private String lastName;
  private int age;

  // set is set raw data, get is derive data
  // if you don't wanna public get this info, 
  // you could hide it without write a getFirst name.
  // but others still can get the full name if getFullName written
  public void setFirstName(String firstName){ 
    this.firstName = firstName;
  }
  public String getFirstName(){ 
    return this.firstName;
  }
  public void setLastName(String lastName){
     this.lastName = lastName;
  }
  public String getLastName(){
    return this.lastName;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  
 
  public String fullName(){
    //return this.firstname + " " + this.lastname;
    return this.firstName.concat(" ").concat(this.lastName); // 有method用method
  }
  public String toString(){
    return "Dog("//
        + "firstName=" + this.firstName //
        + ", lastName=" + this.lastName //
        + ", age=" + this.age//
        + ")";
  }

  
}
