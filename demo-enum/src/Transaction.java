public class Transaction {
  
  private Sign sign;
  private Currency currency;
  private double amount;

  public Transaction(Sign sign, Currency currency, double amount){
    this.sign = sign;
    this.currency = currency;
    this.amount = amount;
  }

  public String toString() {
    return "Transaction(" //
      + "sign" + this.sign //
      + "currency" + this.currency //
      + "amount" + this.amount //
      + ")";
  }  
}
