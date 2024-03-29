public class array {
    public static void main(String[] args) {
        
        // 9 types = Primitives + String
        int x = 2;
        String s = "abc";

        // Array 陣列 (Store a set of same type of value)
        int[] arr = new int[3]; // store 3 or below, can't not resize
        // Assign value to the int array
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = -20000;
        // arr [3] = 100;
        System.out.println(arr[0]); // 100
        System.out.println(arr[1]); // 2
        System.out.println(arr[2]); // -20000
        
        // Create another int array to the original variable
        arr = new int[4];
        System.out.println(arr[0]); // 0
        System.out.println(arr[1]); // 0
        System.out.println(arr[2]); // 0
        System.out.println(arr[3]); // 0

        arr [0] += 10; //10
        arr [0] *= 2; //20
        System.out.println(arr[0]); //20

        long[] arr2 = new long[10];
        String[] strings = new String[2];

        strings [0] = "a";
        strings [1] = "b";
        System.out.println(strings[0]);
        System.out.println(strings[1]);



    }
}
