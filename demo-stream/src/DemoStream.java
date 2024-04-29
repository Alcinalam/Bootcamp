import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    List<Integer> integers = new LinkedList<>();
    integers.add(21);
    integers.add(44);
    integers.add(100);
    integers.add(101);

    // List of Odd number
    List<Integer> odds = new LinkedList<>();
    for (Integer num : integers) {
      if (num % 2 == 1)
        odds.add(num);
    }
    System.out.println(odds);

    // Stream (stream is method in collection)
    List<Integer> result = integers.stream() // List<Integer> -> Stream<Integer>
        .filter(e -> e % 2 == 1) // Stream<Integer>
        .collect(Collectors.toList()); // List<Integer> (new)
    System.out.println(result);

    List<Integer> result2 = integers.stream().filter(e -> e % 2 == 1) //
        .filter(e -> e > 100) //
        .collect(Collectors.toList());
    System.out.println(result2);

    List<Integer> result3 = integers.stream().filter(e -> e % 2 == 1 && e > 100) //
        .collect(Collectors.toList());
    System.out.println(result3);

    List<Integer> integers2 = new LinkedList<>(List.of(101, 101, 203, 200));
    // remove duplicated -> Set
    List<Integer> result4 = integers2.stream() //
        .distinct() //
        .collect(Collectors.toList());
    System.out.println(result4);

    // counting
    long size = integers2.stream() //
        .filter(e -> e < 200) //
        .distinct() // remove duplicate
        .count(); // size
    System.out.println(size); // 1

    List<Customer> customers = new LinkedList<>(
        List.of(new Customer(13, "Jenny"), new Customer(19, "Vincent")));


    List<Customer> adultCustomers = customers.stream()
    // -> new Stream<Customer> heap creat new stream holder of customers
      .filter(c -> c.getAge() >= 18) //
      .collect(Collectors.toList()); // NEW ArrayList() of Customer, point to(->) EXISTING Customer Vincent
      System.out.println(customers);
      System.out.println(adultCustomers);

      customers.get(1).SetAge(28); // updating customers -> adultCustomers has been updated.(both list updated)
      System.out.println("after update=" + customers);
      System.out.println("after update=" + adultCustomers);



  }

  public static List<Integer> getOdds(List<Integer> integers) {
    return integers.stream() //
        .filter(e -> e % 2 == 1) //
        .collect(Collectors.toList());
  }
}
