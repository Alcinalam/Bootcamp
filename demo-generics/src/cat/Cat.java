package cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat extends Animal {

  // difference bewteen :
  // 1. <T extends Cat> void addCat4 (List<T> cats) -> List<Cat>
  // 2. void addCat (List<? extends Cat > cats) -> List<Cat> or List<RedCat>
 
  public static <T extends Animal> void addCat4(List<T> cats) { 
    // can only be List<Animal>
    // can add new cat, new red cat

  }

  public static void addCat(List<? super Cat> cats) { // Cat or above // List<Cat> or List<Animal>
    // compile time check
    cats.add(new Cat()); // OK
    cats.add(new Animal()); // ? 有可能係List <Cat> 放唔到Animal
    cats.add(new RedCat()); // OK 無論咩LIST 都放到Redcat
    
  }

  // coz compiler does not know the list type is List<Cat> or List<Animal>
  // so, during the compile-time, you can add Animal() and it maybe wrong

  public static void addCat2(List<Cat> cats) { //Cat or below

  }

  public static <T extends Cat>void addCats(List<T> cats) { //Cat or below

  }

  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(),new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(),new RedCat())));

     //addCat2(new ArrayList<>(List.of(new Animal(), new Animal()))); // 
     addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
     addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat()))); //OK
     new ArrayList<>(List.of(new RedCat(),new RedCat()));

     List<RedCat> rl = new ArrayList<>(List.of(new RedCat(),new RedCat()));
     //below compile time check type of object reference
     //addCat(rl); //can't as [signature: addCat(List<? super Cat> cats)]
     //can only store in List<Cat> or List<Animal>, rl is List<RedCat>
     //addCat2(rl); // [signature: addCat2(List<Cat> cats)] , List<Cat>only 

     addCat2(new ArrayList<>(List.of (new RedCat(),new RedCat()))); // OK, 
    //[signature: addCat2(List<Cat> cats)] 
    //as an object could be store in List<Cat> or List<Animal>

    List<Animal> la = new ArrayList<>(List.of(new RedCat(),new Cat(),new Animal()));
    addCat4(la); 
    // [signature: <T extends Animal> void addCat4(List<T> cats)]
    // can only be List<Animal>
    // can put type: Animal, Cat , RedCat into List
  }
}
