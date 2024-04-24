public class DemoForLoop2 {
  public static void main(String[] args) { // hotkey: main + enter

    // hotkey: sysout + enter

    // Single loop
    for (int i = 0; i < 5; i++) { // 0,1,2,3,4
      System.out.print("*"); // *****/
    }

    // Nested Loop
    for (int i = 0; i < 3; i++) { // 0,1,2
      for (int j = 0; j < 2; j++) { // 0,1
        System.out.println("i=" + i + ",j=" + j);
      }
      System.out.println("hello");
    }
    // i=0,j=0
    // i=0,j=1
    // i=1,j=0
    // i=1,j=1
    // i=2,j=0
    // i=2,j=1

    // ***** i = 0, j -> 5 - 0 times
    // **** i = 1, j -> 5 - 1 times
    // *** i = 2, j -> 5 - 2 times
    // ** i = 3, j -> 5 - 3 times
    // * i = 4, j -> 5 - 4 times


    int n = 5;

    for (int i = 0; i < n; i++) { // ith
      for (int j = 0; j < n; j++) {
        System.out.println("*");
      }
      System.out.println();
    }

    //    *
    //   ***
    //  *****
    //   ***
    //    *

    // draw the cross first
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if ((i == 2 || j == 2)) {
          System.out.print("*");
        } else if ((i == 1 && j == 1) || (i == 1 && j == 3)
            || (i == 3 && j == 1) || (i == 3 && j == 3)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println(" ");
    }

    // 
    
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 2; i >= 1; i--) {
      for (int j = 1; j <= 3 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // *
    // **
    // ***
    // ****
    // *****

    for (int i = 0; i < 5; i++) { // 0,1,2,3,4,
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Searching
    String str2 = "abcdefg hello world!";
    // Find the index of the second of space character. If exists, print the index, if no, print N/A
    int spaceCount = 0;
    for (int i = 0; i < str2.length(); i++) {
      if (str2.charAt(i) == ' ') {
        if (++spaceCount == 2) {
          System.out.println("index= " + i);// index 13
          break;
        }
      }
    }
    if (spaceCount < 2) {
      System.out.println("N/A");
    }


    // break;
    for (int i = 0; i < 10; i++) {
      if (i > 3) {
        break; // break the nearest loop
      }
      System.out.println("hello");
    }
    // hello
    // hello
    // hello
    // hello

    // continue;
    for (int i = 0; i < 6; i++) {
      System.out.print("123 |");
      if (i > 3) {
        continue; // Skip the rest, go to next iteration
      }
      System.out.print("OK |");
    }



  }
}
