package Customer; // subfolder

import java.util.Arrays;

public class Customer { // one to many

  private String username;

  // one Customer has many order
  private Order[] orders;

  public Customer(String username) {
    this.username = username;
    this.orders = new Order[0];
  }

  public void add(Order order) {
    Order[] copyArr = this.orders;
    this.orders = new Order[this.orders.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.orders[idx++] = copyArr[i];
    }
    this.orders[idx] = order;
  }

  public String toString() {
    return "Customer("//
        + "username=" + this.username //
        + " ,orders=" + Arrays.toString(this.orders) //
        + ")";
  }

}

