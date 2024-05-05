package furnitureSample;

public interface FurnitureFactory {

  Chair createChair();

  Sofa createSofa();

  public static FurnitureFactory create(Style style) {
    return switch (style) {
      case MODERN -> new ModernFactory();
      case VICTORIAN -> new VictorianFactory();
    };

  }
}
