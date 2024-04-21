package beverage;

import java.util.Objects;

public class Coffee extends Beverage {

  private String beansName;

  public Coffee(String name, int volume, String beansName) {
    super(name, volume);
    this.beansName = beansName;
  }

  public void setBeansName(String beansName) {
    this.beansName = beansName;
  }

  public String getBeansName() {
    return this.beansName;
  }
  @Override
  public String toString() {
    return "coffee(" //
        + "name=" + getName() //
        + ", volume=" + getVolume() + "oz" //
        + ", beansName=" + this.beansName //
        + ")";
  }

  
  @Override
  public boolean equals (Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Coffee))
      return false;
    Coffee c = (Coffee) obj;
    return Objects.equals(this.getName(), c.getName())
        && Objects.equals(this.getVolume(), c.getVolume())
        && Objects.equals(this.beansName, c.getBeansName());

    
  }
}
