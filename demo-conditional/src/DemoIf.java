public class DemoIf {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World!" + y); // Hello, World! 10
        } else {
            System.out.println("Test" + y);
        }

        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) { // And events
            System.out.println("x >=0 and x <=2");
        } else {
            System.out.println("x < 0");
        }

        // Example 1
        int a = 12;
        int b = 10;
        int max = a;
        if (b > a) {
            max = b;
        }
        System.out.println("The max number is " + max + ".");
        // Print out: The max nubmer is 12.

        // Example 2
        String day = "Sunday"; // Monday, Tuesday...
        String result = " ";

        if ("Sunday".equals(day)) {
            result = "weekend";
        } else if ("Saturday".equals(day)) {
            result = "weekend";
        } else {
            result = "weekday";
        }
        System.out.println("Sample 1 " + day + " is " + result);
        // Print out: Sunday is weekend.

        // Approch 2
        if ("Sunday".equals(day) || ("Saturday".equals(day))) { // ||係or
            result = "weekend";
        } else {
            result = "weekday";
        }
        System.out.println("Sample 2 " + day + " is " + result);

        // Compare Strings
        // 1. String value compares with Sting variable ("Monday".equals(day))
        // 2. Sting variable compares with String variable

        // Example 3
        int score = 85;
        char grade = ' ';
        String examResult = "passed";

        if (score > 90) {
            grade = 'A';
        } else if (score <= 90) {
            grade = 'B';
        } else if (score <= 79) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        if (examResult == "F") { // char 可以用==
            examResult = "failed";
        }
        System.out
                .println("The grade is " + grade + " and " + examResult + ".");
        // score > 90 -->A (Pass)
        // 80-90 --> B (Pass)
        // 70-79 --> C (Pass)
        // <70 --> F (Fail)
        // Print out: "The grade is B and passed."

        // String
        String s1 = "hello";
        // check if the length of s1 > 5
        if (s1.length() > 5) {
            System.out.println("Yes");

        }
        // Another approach:(! means NOT)
        if (!(s1.length() <= 5)) {

        }

        // char (==, >=, <=, >, <,!=)
        char gender = 'F';
        if (gender == 'M') {

        } else if (gender == 'F') {

        }

        if (gender != 'M') {
            System.out.println("gender is not equals to M");
        }

        // boolean (==, !=)
        int v = 4;
        boolean b1 = v > 10; // false
        if (b1 == true) {

        }
        if (b1 != false) {

        }
        if (!(b1 == true)) {

        }

        // int, long , short , byte, float, double (==, !=, >=,<=,>,<)
        int j = 10;
        if (j > 10.2) { // j -->double
            System.out.println("j > 10.2");
        } else {
            System.out.println("j <= 10.2");// print
        }

        double u = 10.4;
        if (u > 10) { // 10--> double: 10.4 > 10.0
            System.out.println("u > 10");
        }

        //String.charAt(int index) --> return char
        String s2 = "abcdefg";
        
        //check if s2 start with 'a' and end with 'g', print out "yes", otherwise "no"
        //System.out.println(s2.length()-1);
        //System.out.println(s2.charAt(0));
        //System.out.println(s2.charAt(s2.length()-1));
        char start = s2.charAt(0);
        char end = s2.charAt(s2.length()-1);
        if ((start == 'a') && (end == 'g')){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        int age = 18;
        String lastName = "Lau";

        // if the left condition pass, the right one will be skipped
        if (age == 18  || "Lau".equals(lastName)){

        }
        
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false
        System.out.println(true && true); //true

    }
}

