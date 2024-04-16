
public enum Sign {
  DEBIT (-1),//
  CREDIT (1),//
  ;

  private final int value;

  private Sign (int value){
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }



}
