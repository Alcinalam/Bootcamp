import java.util.Arrays;

public class DemoWhileLoop {
    public static void main(String[] args) {

        // 1. initial value
        // 2. continue condition
        // 3. invremental / decremental
        for (int i = 0; i < 3; i++) {

        }

        int[] arr = new int[] {2, 10, 3, -1};
        for (int i = 0; i < arr.length; i++) {

        }

        // for-each loop
        // If you want to loop throught all element from the beignning, you can use for-each
        for (int i : arr) {
            System.out.println(i); // print the value
        }

        String[] strings = new String[] {"abc", "def"};
        for (String str : strings) {
            System.out.println(str); // print value
        }

        // 有條件先要count, while loop
        int count = 0;
        while (count < strings.length) {
            System.out.println(strings[count]);
            count++;
        }
        // Step 1: 0 < Strings.length: 2 /yes
        // Step 2: print sth
        // Step 3: count 0 + 1 = 1
        // Step 4: 1 < Str.length 2 /yes
        // Step 5: print sth
        // Step 6: count 1 + 1 = 2
        // Step 7: 2 < 2 str.length /no -->exit

        // infinite loop
        // byte b = 0;
        // while (b <128) {
        // b++;

        int a = 1023;
        // Target: int array [1,0,2,3]
        // 1023 / 10 = 102
        // 1023 % 10 = 3

        int copy = a;
        count = 0;

        while (copy > 0) {
            copy /= 10;
            count++;
        }
        int[] numArr = new int[count];

        while (a > 0) {
            numArr[count - 1] = a % 10;
            a /= 10;
            count--;
        }
        System.out.println(Arrays.toString(numArr));

        // do-while ->點都行咗一次先
        count = 0;
        do {
            if (count == 1) {
                break;
            }
            System.out.println("hello");
            count++;
        } while (count < 3);


    }
}
