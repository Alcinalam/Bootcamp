public class DemoForLoop {
    public static void main(String[] args) throws Exception {
        int x = 2;
        x = x * x; // 2 * 2 = 4
        x *= x; // 4 * 2 = 8

        // 2^60

        //
        // System.out.println("hello world");
        // System.out.println("hello world");

        // for (initialization; continue condition; value change rule: incremental rule)
        for (int i = 0; i < 3; i++) { // 0, 1, 2
            // Step 1 : int i = 0 (i assign to 0)
            // Step 2 : i < 3 ? yes
            // Step 3 : print hello world
            // Step 4 : i++ --> i become 1
            // Step 5 : i < 3 ? yes
            // Step 6 : Print hello world
            // Step 7 : i++ --> i become 2
            // Step 8 : i < 3 ? yes
            // Step 9 : print hello world
            // Step 10 : i++ --> i become 3
            // Step 11 : 1 < 3 ? no (stop)

            // Never to reassign value to i within the loop
            // i++;

            System.out.println("hello world " + i);

        }

        // for (int i = 5; i > = 0; i--) { // 5,4,3,2,1,0



        // print out: 1 3 5 7 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);

        }


        for (int i = 0; i < 10; i++) { // 1 2 3
            if (i % 2 == 1) { // odd number
                System.out.print(i + " ");

            }

        }

        String s = "abcdefg";
        // print out : aceg
        // chatAt(), String concat
        String result = "";
        for (int i = 0; i < s.length(); i++) { // 0,1,2,3,4,5,6
            if (i % 2 == 0) {
                result += s.charAt(i); // 1,2,4,6 result = result + s.charAt(i)
            }
        }
        System.out.println(result);

        //
        String pattern = "cd";
        // print true
        


        // 55 = 1 + 2 + 3 + 4... + 10
        int max = 10;
        int min = 1;
        // print: 55
        int k = 0;
        for (int i = min; i <= max; i++) {
            k += i;

        }
        System.out.println("sum of: " + k);

        // sum up all even number
        k = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) { // even number
                k += i;
            }
        }
        System.out.println("sum of even: " + k);

        // counting
        String str = "hello world";
        int c = 0;
        
        for (int i = 0; i > str.length(); i++) {
            if (str.charAt(i) == 'l'){
                c++;
            }


        }



        // sum up all ood numbers, and minus all even numbers
        // 1-2+3-4+5...-10
        int k2 = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) { 
                k2 -= i;
            } else {
                k2 += i;
            }
            }
        
        System.out.println("k2" + k2);

    

    }
}
