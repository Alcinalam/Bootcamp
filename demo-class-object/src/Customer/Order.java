package Customer;

import java.util.Arrays;

public class Order {

  private String orderNo;

  private Item [] items;

  public Order (String orderNo){
    this.orderNo = orderNo;
    this.items = new Item[0]; 
  }

  public double total(){
    double total = 0.0d;
    for (int i = 0; i < this.items.length;i++){
      total += this.items[i].subtotal();
    } 
    return total;
  }

  public void add(Item item) {
    Item[] copyArr = this.items;
    this.items = new Item[this.items.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      items[idx++] = copyArr[i];
    }
    items[idx] = item;
  }

  public String toString() {
    return "Order("//
      + "orderNo=" + this.orderNo //
      + ", items=" + Arrays.toString(this.items) //
      + ")";
  }
}
