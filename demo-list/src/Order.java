import java.util.Objects;

public class Order {
  
  private int amount;

  public Order (int amount) {
    this.amount = amount;
  }

  // public void setAmount (int amount) {
  //   this.amount = amount;
  // }

  public int getAmount () {
    return this.amount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.amount);
  }

  @Override
  public String toString () {
    return "Order(" // 
      + "amount=" + this.amount // 
      + ")";
  }

}
