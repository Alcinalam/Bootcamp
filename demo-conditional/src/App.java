public class App {
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
        if (examResult == "F") { //char 可以用==
            examResult = "failed";
        }
        System.out.println("The grade is " + grade + " and " + examResult + ".");
        // score > 90 -->A (Pass)
        // 80-90 --> B (Pass)
        // 70-79 --> C (Pass)
        // <70 --> F (Fail)
        // Print out: "The grade is B and passed."



    }
}
