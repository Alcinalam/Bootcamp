package beverage;

import java.util.Objects;

public class Liquor extends AlcoholicBev {

  private String material;

  public Liquor(String name, int volume, int abVol, String material) {
    super(name, volume, abVol);
    this.material = material;
  }

  @Override
  public String toString() {
    return "Liquor(" //
        + "name=" + getName() //
        + ", volume=" + getVolume() + "ml" //
        + ", abVol=" + getAbVol() + "%" + ", material=" + this.material //
        + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj )
      return true;
    if (!(obj instanceof Liquor))
      return false;
    Liquor l = (Liquor) obj;
    return Objects.equals(this.getName(),l.getName())
      && Objects.equals(this.getVolume(),l.getVolume())
      && Objects.equals(this.getAbVol(),l.getAbVol());
  }


  public static void main(String[] args) {
    Liquor liquor = new Liquor("rum", 750, 50, "sugarCane");
    Liquor liquor2 = new Liquor("rum", 750, 50, "sugarCane");
  
    System.out.println(liquor);

    System.out.println(liquor2.equals(liquor));    
  }



}
