import java.util.List;
import java.util.Vector;

public class DemoVector {


  static List<Character> characters = new Vector<>();

  public static void main(String[] args) {


    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        characters.add('s');
      }
    };

    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();

    // 3 threads to 1 thread
    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(characters.size()); // 2000000

  }
}
