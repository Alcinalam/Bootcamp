package furnitureSample;

public class Customer {
  public static void main(String[] args) {
    FurnitureFactory factory = FurnitureFactory.create(Style.VICTORIAN);

    Chair chair = factory.createChair();
    System.out.println(chair.hasLeg());

    Sofa sofa = factory.createSofa();
    System.out.println(sofa.isSingleSeat());
  }
}
