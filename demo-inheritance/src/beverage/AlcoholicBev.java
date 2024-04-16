package beverage;

public class AlcoholicBev extends Beverage {

  private int abVol;

  public AlcoholicBev(String name, int volume, int abVol) {
    super(name, volume);
    this.abVol = abVol;
  }

  public int getAbVol() {
    return this.abVol;
  }
}
