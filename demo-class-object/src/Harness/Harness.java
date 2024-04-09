package Harness;

import java.util.Arrays;

public class Harness {

  private String harnessName;

  private BomList[] bomList;

  public Harness(String harnessName) {
    this.harnessName = harnessName;
    this.bomList = new BomList[0];
  }

  public void add(BomList bomList) {
    BomList[] copyArr = this.bomList;
    this.bomList = new BomList[this.bomList.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      this.bomList[idx++] = copyArr[i];
    }
    this.bomList[idx] = bomList;
  }

  public String toString() {
    return "Harness(" //
        + "harnessName=" + this.harnessName //
        + " ,bomList=" + Arrays.toString(this.bomList) //
        + ")";

  }
}
