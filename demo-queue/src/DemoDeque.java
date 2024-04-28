import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class DemoDeque { //got head & tail
  public static void main(String[] args) {
    // Deque extend Queue

    Deque<String> strings = new LinkedList<>();
    strings.add ("hello"); // add tail by default (addLast)
    strings.add ("abc");

    strings.addFirst("ijk"); // addFirst -> head
    System.out.println(strings); //[ijk, hello, abc]

    System.out.println(strings.poll()); // ijk, pollFirst()
    System.out.println(strings.pollLast()); //abc, poll the element from tail

    strings.add("world");
    System.out.println(strings.peekFirst()); // hello
    System.out.println(strings.peekLast()); // world
    
    strings.pop(); // removeFirst, but will throw exception
    System.out.println(strings); //world

    strings.push("mmm"); // addFirst[mmm,push]
    System.out.println(strings);

    // stack (pop, push)

    List<String> strings3 = new Stack<>();
    strings3.add("hello"); // thread-safe

    Stack<String> strings4 = new Stack<>();
    strings4.push("hello");
    strings4.push("hello2");
    strings4.push("hello3");
    System.out.println(strings4.pop()); // hello3, put inside, take the last one
    
    // Use case : reverse  (can use it for reverse a list) <---試做
    
    // Queue / Deque --> LinkedList or Array's prenstation
    Queue<String> qs = new ArrayDeque<>(); // <--Array base (LinkedList / Array)
    qs.add("hello");
    qs.add("abc"); // Array -> resize

    System.out.println(qs.poll()) ; // poll out hello

    qs.add("x");
    qs.add("y");
    qs.remove(); //abc
    System.out.println(qs); //[x, y]
    qs.remove("y");
    System.out.println(qs); // [x] 
    
    Deque<String> ds = (Deque<String>) qs;
    ds.addLast("mnm");
    ds.addFirst ("nmn");
    System.out.println(ds); // [nmn, x, mnm]

    System.out.println(qs);
    qs.offer("ooo");
    qs.add("ooo");
    System.out.println(qs);

    Deque<String> ds2 = new LinkedBlockingDeque<>(2); // fixed size 
    ds2.add("hello");
    ds2.add("world");
    System.out.println(ds2.size());
    // ds2.add("xxx"); // java.lang.IllegalStateException: Deque full
    System.out.println(ds2.offer("YYY")); //false
    System.out.println(ds2); // no add
    //above ClassCastException - if the class of the specified element prevents it from being added to this queue



  }
}
