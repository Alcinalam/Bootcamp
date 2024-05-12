import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Customer {

  private Optional<String> name;

  public Optional<String> getName() {
    // getName() well-known method, everyone know there will be a chance to be null
    // getter/setter should not return Optional <T>

    return this.name;
  }

  // deserialiation/ serialiaztion 序列化
  // {
  // "name" : "John"
  // }

  // Java Object <-> JSON (deserialization/serialiaztion)
  // Optional<T> cannot be supported by deserialization/serialiaztion

  public static void main(String[] args) {
    Optional<String> result = null;
    result = Optional.of("hello"); // Optional[hello]
    result = Optional.empty(); // Optional.empty, optional object with null value
    System.out.println(result);

    String str = "hello";
    int x = 10;
    if (x >= 10)
      str = null;
    result = Optional.ofNullable(str); // can store null or non-null object
    // Optional.of(null); // NPE

    List<String> names = new ArrayList<>(List.of("Tom", "Jenny", "Ben"));
    // stream
    List<Optional<String>> result2 = names.stream()//
        .map(e -> Optional.ofNullable(e)) //
        // .map(Optional :: ofNullable) // method reference (in, out same as e)
        .collect(Collectors.toList());
    System.out.println(result2);



  }


}
