package furnitureSample;

public class ModernFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    System.out.println("Modern Chair");
    return new ModernChair();
  }

  @Override
  public Sofa createSofa() {
    System.out.println("Modern Sofa");
    return new ModernSofa();
  }

}
