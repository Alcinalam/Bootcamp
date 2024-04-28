public class App {
    public static void main(String[] args) throws Exception {

        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        System.out.println(result);
        System.out.println("multiplay" + multiply(5));
        System.out.println("add even" + addEven(6));
    }

    // 2 + 4 + 6 + 8 + 10 ...98 + 100
    public static int addEven(int n) {
        if (n <= 2)
            return n;
        return n + addEven(n - 2);
    }

    // multiply
    public static int multiply(int n) {
        // base case (exit criteria)
        if (n <= 1)
            return 1;

        return n * multiply(n - 1);
        // 5 * (5-1) --> waiting 1 release 4 (when we put (5-1) to multiply(),waiting an int value returned)
        // 4 * (4-1) --> waiting 2 release 3
        // 3 * (3-1) --> waiting 3 release 2
        // 2 * (2-1) --> waiting 4 release 1
        // 1 -> return 
        
        //Start
        // multiply (5)
        // n<= 1 (n=5)
        // 5*(5-1)

        // multiply (4)
        // n=4
        // 4*(4-1)

        // multiply (3)
        // n=3
        // 3*(3-1)

        // multiply (2)
        // n=2
        // 2*(2-1)

        // multiply (1)
        // n=1 >> return

        // return multiply (5)multiply (4)multiply (3)multiply (2)multiply 
        // multiply (1)


        // fibonacci sequence: 0,1,1,2,5,5,8,13,21,34,55,89,144
        // n = 1 -> 0
        // n = 2 -> 2
        // n = 3 -> 8


    }


}
