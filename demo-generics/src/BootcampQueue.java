import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BootcampQueue<T> {

  private Queue<T> data;

  public BootcampQueue () {
    this.data = new LinkedList<>();
  }

  // add
  public void add2 (T s) { // s -> Integer or String Customer
    this.data.add(s);
  }
  // Objects in pram > mean can be anything, no type checking in complile time
  // T in pram > mean can be one thing, but not known which one, with compile time checking

  // poll
 public T poll() {
  return this.data.poll();
 }

  public static void main(String[] args) {
    BootcampQueue<String> bq = new BootcampQueue<>();
    bq.add2("hello");
    // bq.add2(3); // compile time type check, cannot coz is not create type as int

    BootcampQueue<Integer> bq1 = new BootcampQueue<>();
    bq1.add2(4);

    
  }
  
}
