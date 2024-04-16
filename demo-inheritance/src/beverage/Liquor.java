package beverage;

public class Liquor extends AlcoholicBev {

  private String material;

  public Liquor(String name, int volume, int abVol, String material) {
    super(name, volume, abVol);
    this.material = material;
  }

  public String toString() {
    return "Liquor(" //
        + "name=" + getName() //
        + ", volume=" + getVolume() + "ml" //
        + ", abVol=" + getAbVol() + "%" + ", material=" + this.material //
        + ")";
  }

  public static void main(String[] args) {
    Liquor liquor = new Liquor("rum", 750, 50, "sugarCane");
    System.out.println(liquor);
  }



}
