import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

  public static void main(String[] args) {

    // 1. filter
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> evenNumbers = numbers.stream()//
        .filter(num -> num % 2 == 0).collect(Collectors.toList());
    System.out.println("EvenNumbers" + "=" + evenNumbers);
    // [2, 4, 6, 8, 10]

    // 2. map
    List<String> name = List.of("alice", "ben", "ken");
    List<String> nameformat = name.stream()//
        .map(e -> e.substring(0, 1).toUpperCase()
            .concat(e.substring(1).toLowerCase()))//
        .collect(Collectors.toList());
    System.out.println("nameformat" + "=" + nameformat);
    // [Alice, Ben, Ken]

    // 3. flatMap + distinct + sort
    List<String> s1 = new ArrayList<>(List.of("A", "E", "H", "M", "K"));
    List<String> s2 = new ArrayList<>(List.of("F", "C", "J", "L", "C", "P"));
    List<String> s3 = new ArrayList<>(List.of("G", "B", "I", "A", "G"));

    List<List<String>> alphabet = new ArrayList<>(List.of(s1, s2, s3));

    Set<String> set = alphabet.stream() //
        .flatMap(l -> l.stream()) //
        // .distinct() //
        .sorted()//
        .collect(Collectors.toSet());
    System.out.println("set" + "=" + set);
    // [A, B, C, E, F, G, H, I, J, K, L, M, P]

    // 4. Sorted
    List<Integer> numbers1 = List.of(5, 2, 4, 8, 1, 7, 9, 3, 6);
    List<Integer> sortedNumbers = numbers1.stream()//
        .sorted((a, b) -> a.compareTo(b)) // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        .sorted((a, b) -> b.compareTo(a)) // [9, 8, 7, 6, 5, 4, 3, 2, 1
        .collect(Collectors.toList());
    System.out.println("sortedNumbers" + "=" + sortedNumbers);

    // 5. limit
    List<String> q = List.of("1st", "2nd", "3rd", "4th", "5th");
    List<String> limited3 = q.stream() //
        .limit(3).collect(Collectors.toList());
    System.out.println("limited3" + limited3);

    // -----------------

    // min , max

    List<Integer> num1 = List.of(9, 4, 33, 4, 1);
    Optional<Integer> min = num1.stream()//
        .min((a, b) -> a.compareTo(b));
    if (min.isPresent()) {
      System.out.println("min=" + min.get());
    } else {
      System.out.println("min Not found");
    }

    Optional<Integer> max = num1.stream()//
        .min((a, b) -> b.compareTo(a));
    if (max.isPresent()) {
      System.out.println("max=" + max.get());
    } else {
      System.out.println("max Not found");
    }

    // check null in stream with default could be made
    List<Integer> num2 = List.of(5, 2, 8, 3, 1);
    Integer min2 = num2.stream().min((a, b) -> a.compareTo(b))
        // .orElseGet(()-> -1);
        // .orElseThrow(() -> new IllegalArgumentException());
        .orElse(null);

    if (min2 != null) {
      System.out.println("Min=" + min2);
    } else {
      System.out.println("No min found.");
    }

    // allMatch
    List<String> names1 =
        List.of("Ada", "Mandy", "Ken", "Jill", "Jerry", "banananaanna");

    boolean over3characters = names1.stream() //
        .anyMatch(n -> n.length() > 3);
    System.out.println("over3characters" + over3characters);

    boolean containE = names1.stream() //
        .anyMatch(n -> n.contains("e"));
    System.out.println("ContainE=" + containE);


    // noneMatch
    boolean notEmpty = names1.stream()//
        .noneMatch(s -> s.isEmpty());
    System.out.println("notEmpty=" + notEmpty);

    // reduce
    Optional<String> longest = names1.stream()//
        .reduce((a, b) -> a.length() >= b.length() ? a : b);//
    longest.ifPresent(l -> System.out.println(l));

    List<String> s4 = List.of("123", "-", "456", "-", "789");
    Optional<String> trimconcate = s4.stream()//
        .reduce((a, b) -> a.concat(b));
    trimconcate.ifPresent(s -> System.out.println(s));


    // FindFirst & ifPresent refer to DemoOptional.java
    // Optional : findFirst, findAny, max,min ...
    // orElse (default value), orElseGet(()-> dosth as default)

  }
}
