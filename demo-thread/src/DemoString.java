public class DemoString {

  static String str = "a"; // not thread safe
  private final static Object lock = new Object();

  public static void main(String[] args) {
    Runnable addupString = () -> {


      int count = 0;
      for (int i = 0; i < 10_000; i++) {

        synchronized (lock) {
          str = str + i;
          count++;
        }

      }
    };

    Thread th1 = new Thread(addupString);
    Thread th2 = new Thread(addupString);
    th1.start();
    th2.start();

    try {
      th1.join();
      th2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(str.length());


  }
}
