package builtin;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DemoFunction {
  
  public static void main(String[] args) {
    // y = f(x)
    // y = x + 1

    Function<String, Integer> function = s -> s.length(); 
    // left put-in <String>, right return <Integer>
    System.out.println(function.apply("Hello")); //5

    BiFunction<Integer, Integer, Integer> sum = (x,y) -> {
      return x + y;
    };
    sum.apply(3, 4); // 7

    BiFunction<String, String, Integer> totalLength = (s1,s2) -> s1.length() + s2.length();
    // 2 put-in , 1 return
    System.out.println(totalLength.apply("hello","abc")); // 8

    // Why do we need to learn BiFunction
    Map<String, Integer> nameLengthMap = new HashMap<>();
    nameLengthMap.put("John", "John".length());

    Function<String,Integer> nameLength = s -> s.length();
    nameLengthMap.computeIfAbsent("Vincent",nameLength); 
    // if "Vincent" does not exist -> use nameLength function

    nameLengthMap.computeIfAbsent("Oscar", s -> s.length()); 
    System.out.println(nameLengthMap);

    // merge()
    nameLengthMap.merge("Vincent",9,(o,n)-> o * n ); 
    //7 * 9 find out Keyvalue, 9-> par, formula
    

    // Method Reference
    Function <String, Integer> stringToInteger = Integer::valueOf;
    Integer number = stringToInteger.apply("123");
    System.out.println(number);



  }
}
