package beverage;

public class Beverage {

  private String name;
  private int volume;


  public Beverage() {

  }

  public Beverage(String name, int volume) {
    this.name = name;
    this.volume = volume;
  }

  public String getName() {
    return this.name;
  }

  public int getVolume() {
    return this.volume;
  }

}
