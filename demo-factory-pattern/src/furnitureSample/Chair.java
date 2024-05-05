package furnitureSample;

public interface Chair {

  boolean hasLeg();

  public static Chair create(FurnitureFactory factory) {
    return factory.createChair();
  }
}
