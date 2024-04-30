import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {

  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();
    // static method -> constructor -> new stream object
    System.out.println(empty.count()); // 0

    Stream<String> strings = Stream.of("hello", "abc");
    // static method -> constructor -> new stream object
    // filter, collect

    Stream<Integer> integers = Stream.iterate(1, n -> n + 2).limit(10);
    System.out.println(integers.collect(Collectors.toList()));

    // one Stream can only terminal one time
    // strings.filter(e -> e.length()>3) // intermediate operation
    // .count(); // terminal operation, 離開咗stream 形態

    strings = strings.filter(e -> e.length() > 3); // intermediate operation -> new stream
    // .count(); // terminal operation, 離開咗stream 形態
    // System.out.println(strings.collect(Collectors.toList())); // [Hello]

    // stream -> forEach
    strings.forEach(e -> { // terminal operation
      System.out.println(e);
    });

    // sorted()
    List<Integer> integers2 =
        new ArrayList<>(List.of(400, 3, -1, 0, 100, -200));
    List<Integer> integers3 = integers2.stream() //
        .filter(e -> e.compareTo(0) >= 0) // >=0
        .sorted() // interminate operation
        .collect(Collectors.toList());
    System.out.println(integers3);

    List<Customer> customers = new LinkedList<>(List.of(new Customer(12, "ken"),
        new Customer(3, "Ben"), new Customer(8, "Tom"),new Customer(17, "Tom")));

    Comparator<Customer> sortByAgeDesc = (c1,c2) -> c1.getAge() > c2.getAge() ? -1 : 1;

    List<Customer> sortedCustomers = customers.stream() //
      .sorted(sortByAgeDesc) // comparator object descending ordering for age
      .collect(Collectors.toList());
    System.out.println(sortedCustomers);

    // List<Customer> -> List <String>
    // Type change
    List<String> names = customers.stream() //
      .map(e -> e.getName()) //type change: Customer to String   
      .filter(s -> s.startsWith("T")) // filter object
      .sorted()
      .collect(Collectors.toList());

    System.out.println(names);

    Stream.of(1,2,3).map(i -> {
      System.out.println(i); // 1,2,3
      return i + 1; 
    }).forEach(e -> System.out.println(e));// <-terminal 2,3,4
    // because map() is intermiate operations, the map function will not be executed until termial opreation

    Stream.of(1,2,3).map(i -> {
      System.out.println(i); // 1,2,3
      return i + 1; 
    }).count();// <-terminal 2,3,4
    // becuase map() won't affect the result of count,
    // so Stream would NOT execute map function if the terminal operation is count()

  }
}
