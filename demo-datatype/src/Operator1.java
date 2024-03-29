public class Operator1 {
  public static void main(String[] args) {
    // increment
    int x = 1;
    x = x + 1; // x + 1 -> 1 + 1
    x = x + 1; // 3

    int y = 1;
    y++; // 2
    y++; // 3
    ++y; // 4
    y = y + 1; // 5
    y += 1; // 6, "+=" -> self + 1
    // System.out.println(y);

    int e = 10;
    // e--;
    // --e;
    // e = e - 1;
    // e -= 1;
    System.out.println(e); // 6
    int f = 10;

    // int predecrement = --e; // predecrement = 5 deduct first, assign later
    // e = e - 1;
    System.out.println("e : " + e--); // 5
    System.out.println("f : " + --f); // 5

    int postdecrement = e--; // postdecrement = 5 assign first deduct later
    int w = e - 1;
    e = w;
    System.out.println(postdecrement); // 5
    System.out.println(e); // 4

    // two steps above, first assign and then deduction



  }

}
