package beverage;

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

  public String toString() {
    return "coffee(" //
        + "name=" + getName() //
        + ", volume=" + getVolume() + "oz" //
        + ", beansName=" + this.beansName //
        + ")";
  }

}
