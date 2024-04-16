package beverage;

public class Main {
  public static void main(String[] args) {

    Liquor liquor = new Liquor("rum", 750, 50, "sugarCane");
    System.out.println(liquor);


    Coffee coffee = new Coffee("Americano", 8, "arabica");
    System.out.println(coffee);

    Coffee coffee2 = new Coffee("Latte", 12, "bourbon");
    System.out.println(coffee2);
    coffee2.setBeansName("robusta");
    System.out.println(coffee2);

  }
}
