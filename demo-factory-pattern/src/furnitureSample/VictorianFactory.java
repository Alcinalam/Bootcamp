package furnitureSample;

public class VictorianFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    System.out.println("VictorianChair");
    return new VictorianChair();
  }


  @Override
  public Sofa createSofa() {
    System.out.println("VictorianSofa");
    return new VictorianSofa();
  }


}
