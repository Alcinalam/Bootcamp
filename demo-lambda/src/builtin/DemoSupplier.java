package builtin;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;


public class DemoSupplier {

  public static void main(String[] args) {

    Supplier<String> greeting = () -> "hello";
    System.out.println(greeting.get()); // return String "hello"

    Supplier<Weekday> firstDOW = () -> Weekday.MONDAY;
    System.out.println(firstDOW.get());
    
    Weekday monday2 = Weekday.MONDAY; // ??

    printName(() -> Weekday.MONDAY);

    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());

    Supplier<Integer> random = () -> new Random().nextInt(10) + 1; // 0-9 +1 = 1-10
    System.out.println(random.get());


  }

  public static void printName(Supplier<Weekday> weekday) {
    System.out.println(weekday.get());
  }



}
