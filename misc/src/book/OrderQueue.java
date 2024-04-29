import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {

  public static void main(String[] args) {
    
    LinkedList <String> strings = new LinkedList<>();
    strings.add("Order1");
    strings.add("Order2");
    ;
    
    int [] arr = new int[] {1 ,2, 3, 4, 5};
    Queue<Integer> integers = new LinkedList<>();
    
    for (int i = 0; i <arr.length;i++){
      integers.add(arr[i]);
    }
    Queue<Integer> backupQueue = new LinkedList<>(integers);
    
    // int val = -1;
    // int size = integers.size();
    // while (size-- > 0) {
    //   val = integers.poll();
    //   if (val % 2 == 1)
    //     integers.add(val);
    // }
    System.out.println(integers);
    System.out.println(backupQueue);

    Deque<Integer> integersd = new LinkedList<>(integers);
    
    System.out.println("dqueue" + integersd);
    System.out.println("queue" + integers);
    System.out.println("backupq" + backupQueue);

    


  }
}
