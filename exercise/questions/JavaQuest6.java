package exercise.questions;

import java.util.Arrays;

public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */

  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence

    int sum = 0;
    int[] arr = new int[15];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < 15; i++) { // 0,1,2,3,4,5,6,7..
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    System.out.println(Arrays.toString(arr));


// second approach (less space)
    int n = 1;
      if (n < 2) {
          System.out.print(n + " ");
      }
      int p = 0, q = 0, r = 1;
      for (int i = 2; i < 16; ++i) {
          p = q; 
          q = r; 
          r = p + q;
          System.out.print(r + " ");
      }
  }
}
