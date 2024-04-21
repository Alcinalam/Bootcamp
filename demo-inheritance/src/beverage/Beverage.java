package beverage;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "Beverage(" //
      + "name=" + this.name //
      + " ,volume" + this.volume //
      + ")";
  }
  @Override
  public boolean equals (Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Beverage))
      return false;
    Beverage b = (Beverage) obj;
    return Objects.equals(this.name, b.getName())
        && Objects.equals(this.volume,b.getVolume());
  } 



}
