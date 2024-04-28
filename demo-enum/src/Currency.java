public enum Currency {
  HKD (7.8), //
  USD (1), //
  CNY(7.2), //
  JPY (150), //
  ;

  private double rate;

  private Currency (double rate){
    this.rate = rate;
  }

  public double getRate(){
    return this.rate;
  }
}
