import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {

  // HashTable -> Thread-safe
  // HashMap -> non Thread-safe
  static Map<Integer, Integer> map2 = new HashMap<>(); // 1057910
  static Map<Integer, Integer> map = new Hashtable<>(); // 1000000

  public static void main(String[] args) {
    Runnable hashmapinput = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        map.put(i, i);
      }
    };

    Thread th1 = new Thread(hashmapinput);
    Thread th2 = new Thread(hashmapinput);
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(map.size());
  }
}
