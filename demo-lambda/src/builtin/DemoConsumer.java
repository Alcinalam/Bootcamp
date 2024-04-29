package builtin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {

  public static void main(String[] args) {
    // viod accept (T t)
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("hello");

    Consumer<List<Integer>> printer2 = integers -> {
      for (Integer i : integers) {
        System.out.println(i);
      }
    };
    printer2.accept(new ArrayList<>(List.of(12, 300, 29)));


    BiConsumer<String, Boolean> printer3 = (s, b) -> {
      if (b == true)
        System.out.println(s);
      else
        System.out.println(s.length()); // 8
    };
    printer3.accept("Bootcamp", false);

    List<String> strings = new LinkedList<>();
    strings.add("ABC");
    strings.add("DEF");

    int o = 3; // local variable in main method

    // for-each
    for (String s : strings) {
      o += 1;
    }

    // for loop
    for (int i = 0; i < strings.size(); i++) {
      o += 1;
    }

    // foreach (lambda - Consumer)
    strings.forEach(s -> {
      // o += 1; // lambda foreach: cannot modify non-local variable
      int p = 1;
      System.out.println(s);
    });

    // p = 2; // outside lambda can't use variable that created inside the lambda function

    // for each (lambda - Map -> BiConsumer)
    Map<String, String> nameMap = new HashMap<>(); // 末抄完本身MAP for loop
    nameMap.put("Vincent", "abc");
    nameMap.put("Jenny", "ijk");
    for (Map.Entry<String, String> entry : nameMap.entrySet()) {

    }

    nameMap.forEach((k, v) -> {
      System.out.println("k=" + k + ", v=" + v);
    });

    // copy of String value
    for (String str : strings) {
      str = "hello";
      System.out.println("inside loop= " + str); // inside loop= hello
    }
    System.out.println("outside loop " + strings); // outside loop [ABC, DEF]

    strings.forEach(e -> {
      e = "hello";
      System.out.println("inside loop=" + e);
    });
    System.out.println("outside loop=" + strings); // outside loop=[ABC, DEF]

    Queue<String> q = new LinkedList<>();
    strings.forEach(e -> { // lambda can't
      q.add(e); // OK change LinkedList object ref. point to new o.value
      // q = new ArrayDeque<>(); // q 不能轉指針, 改成條Queue
    });

    Queue<String> q2 = new LinkedList<>();
    for (String str : strings) { // others for look okay
      q2.add(str); // OK
      q2 = new ArrayDeque<>();
    }

  }
}
