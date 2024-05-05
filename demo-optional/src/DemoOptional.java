import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOptional {
    public static void main(String[] args)  { //mostly use on return type
        System.out.println(upperName("Steven")); // Optional[STEVEN]
        System.out.println(upperName("Steven").get()); // STEVEN
        System.out.println(upperName(null)); // Optional.empty

        Optional.of("abc"); // if null NPE

        // 1. ifPresent()
        Optional<String> result = upperName("abc");

        result.ifPresent(e -> { // e is T (String.class)
            System.out.println("hello" + e.charAt(0)); // e must be non-null value
        });

        upperName ("Steven").ifPresent(e -> {
            System.out.println("hello" + e.charAt(0)); 
        });


        // 2. isPresent()
        Optional<String> name = Optional.of("Ben");
        if (name.isPresent()){
            System.out.println("isPresent = " + name.get().charAt(0)); // no risk on NPE
        } else {
            System.out.println("isPresent = " + name); // Optional.empty -> you cannot call get()
        }
        
        Optional<String> name2 = Optional.ofNullable("abc");
        // 3. orElse
        String user = name2.orElse("Jenny"); // name Optional, T
        System.out.println("user= " + user); // Jenny

        // 4. orElseGet
        String user2 = name2.orElseGet(() -> "Jenny"); // Supplier <T>
        System.out.println("user2= " + user2); // Jenny

        // 5. orElseThrow
        String user3 = name2.orElseThrow(()-> new RuntimeException()); // 
        System.out.println("user3= " + user3); // throw exception

        // 6. stream and optional
        // findFirst orElse
        Cat cat = List
        //.of(new Cat(3,"Vincent"),new Cat(6,"Oscar"),new Cat (2,"Vincent"),new Cat(5,"Jenny"))
        .of(new Cat(6,"Oscar"),new Cat(5,"Jenny"))
            .stream() //
            .filter (e -> "Vincent".equals(e.getName()))
            .findFirst()// optical <Cat>
            .orElse(new Cat(0, "Vincent")); // cat
        System.out.println(cat.getName() + cat.getAge()); //Vincent0

        // findFirst ifPresent
        List
        //.of(new Cat(3,"Vincent"),new Cat(6,"Oscar"),new Cat (2,"Vincent"),new Cat(5,"Jenny"))
        .of(new Cat(6,"Oscar"),new Cat(5,"Jenny"))
            .stream() //
            .filter (e -> "Vincent".equals(e.getName()))
            .findFirst()//
            .ifPresent(e -> {
                System.out.println(e.getAge());// print nothing
            });
        
   

       

    }


    public static Optional<String> upperName(String name) {
        // if (name == null)
        // throw new IllegalArgumentException();
        if (name != null)
            return Optional.of(name.toUpperCase());
        return Optional.empty(); // optional object, with null inside
    }
}
