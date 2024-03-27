public class DemoSwitch {
  public static void main(String[] args) {

    // score > 90 -->A (Pass)
    // 80-90 --> B (Pass)
    // 70-79 --> C (Pass)
    // <70 --> F (Fail)
    // Print out: "The grade is B and passed."

    // break --> exit
    char grade = 'D';
    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        break;
      case 'B':
        System.out.println("This is grade B");
        break;
      case 'C':
        System.out.println("This is grade C");
        break;
      case 'D':
        System.out.println("This is grade D");
        break;
      default:
        System.out.println("Default Value");

      //Grade A:5
      //B:4
      //C:3
      //D:2
      //E:1
      //F:0

    int score = 0;
    switch (grade) {
      case 'A':
        score++;
      case 'B':
        score++;
      case 'C':
        score++;
      case 'D':
        score++;
      case 'E':
        score++;
      default:  
    }
    System.out.println("score=" + score) ; // score=3

    // switch (CANNOT compare value)


    }
  }
}
