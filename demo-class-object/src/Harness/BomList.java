package Harness;

import java.util.Arrays;
import java.math.BigDecimal;

public class BomList {

  private String bomList;

  private Part[] parts;

  public BomList(String bomList) {
    this.bomList = bomList;
    this.parts = new Part[0];
  }

  public double harnessCost() {
    double total = 0.0d;
    for (int i = 0; i < this.parts.length; i++) {
      total += this.parts[i].partCost();
    }
    return total;
  }

  public void add(Part part) {
    Part[] copyArr = this.parts;
    this.parts = new Part[this.parts.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      parts[idx++] = copyArr[i];
    }
    parts[idx] = part;
  }

  public String toString() {
    return "BomList(" //
        + "usage=" + this.bomList //
        + " ,parts=" + Arrays.toString(this.parts) //
        + ")";
  }



}
