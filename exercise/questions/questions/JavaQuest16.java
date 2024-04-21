package exercise.questions.questions;


import java.util.Arrays;

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1

  }

  // code here ...
  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  public static int[] sumToZero(int nums) {
    int[] sum = new int[nums];
    int sum1 = 0;
    if (nums == 0) {
      sum[0] = 0;
      return sum;
    } else if (nums % 2 == 0) {
      for (int i = 1; i < nums; i++) {
        sum[i] = i;
        sum1 += i;
        sum[0] = -sum1;
      }
    } else {
      for (int i = 1; i < nums; i++ ) {
        sum[i] = i;
        sum1 += i;
        sum[0] = -sum1;
      }
    }
    return sum;
  }
}
