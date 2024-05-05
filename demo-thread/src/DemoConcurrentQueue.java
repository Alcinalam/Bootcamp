import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DemoConcurrentQueue {

  // thread-safe
  static Queue<Character> characters = new ConcurrentLinkedDeque<>();

  public static void main(String[] args) {

    Runnable concatLinkedList = () -> {
      for (int i = 0; i < 10_000_000; i++) {
        characters.add('s');
      }
    };

    Thread th1 = new Thread(concatLinkedList);
    Thread th2 = new Thread(concatLinkedList);
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(characters.size()); // 20000000

  }
}
