import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue { //FIFO
    public static void main(String[] args) {
        // Queue is a contract/ interface
        List<String> strings = new LinkedList<>();
        strings.add("hello");
        strings.remove(0);
        strings.add("def");

        Queue<String> string2 = (Queue<String>) strings; // change to queue, risk
        // string2.remove(1); queue without remove by index, does not have index concept
        string2.add("abc");

        System.out.println(string2.size()); // 2

        System.out.println(string2.poll());// def (poll() means remove and return the head object
        System.out.println(string2); // [abc]
        System.out.println(string2.poll()); // abc
        System.out.println(string2.poll()); // null

        string2.add("xyz");
        string2.add("ijk");
        System.out.println(string2.peek()); // xyz, return the head object (without removal)

        // while loop (loop -> remove ojbect and read object)
        while (!string2.isEmpty()) { // size() is not stable
            System.out.println(string2.poll());
        }
        System.out.println(string2.size()); // 0

        string2.add("Vincent");
        string2.add("Oscar");

        // remove even number
        Queue<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(101);
        integers.add(2);
        integers.add(99);
        integers.add(-8);

        int val = -1;
        int size = integers.size();
        while (size-- > 0) { // 5,4,3,2,1
            val = integers.poll();
            if (val % 2 == 1)
                integers.add(val);
        }

        System.out.println(integers);
        System.out.println(integers.size());

        System.out.println(integers.remove()); // 1, what is the difference between remove() and poll()
        System.out.println(integers); // [101, 99]
        System.out.println(integers.remove()); // 101
        System.out.println(integers.remove()); // 99
        System.out.println(integers.size()); // 0
        // System.out.println(integers.remove());
        // above java.util.NoSuchElementException, empty cannot remove, poll() return null

        integers.add(2000);
        integers.add(1000);
        System.out.println(integers.remove(1000)); // true
        System.out.println(integers.remove(1500)); // false, because Integer.class has override equals()


        int[] arr = new int[] {2, 3, 4};
        int[] backup = Arrays.copyOf(arr, arr.length); // copyOf() -> create another array
        arr[1] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(backup));


    }
}
