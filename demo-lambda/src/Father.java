public class Father implements Swim{

  @Override
  public void swim() {

  }


  public static void main(String[] args) {
    // Before Lambda
    Father father = new Father();
    father.swim();


    // After Lambda (after java 8)
    Swim father2 = () -> {
      System.out.println("Swiming");
    };

    Swim mother = () -> {
      System.out.println("Mother");
    };

    father2.swim();
    mother.swim();

    

  }
}
