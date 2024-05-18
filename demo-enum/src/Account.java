import java.util.Arrays;

public class Account {

  private Transaction[] transactions;

  public Account() {
    this.transactions = new Transaction[0];
  }

  public void add(Transaction transaction) {
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[copyArr.length + 1];
    int idx = 0;
    for (Transaction t : copyArr) {
      this.transactions[idx++] = t;
    }
    this.transactions[idx] = transaction;
  }

 
  public double balance() {
    double sum = 0.0d;
    for (int i = 0; i < transactions.length;i++) {
      if(transactions[i].getSign()== Sign.CREDIT){
        sum += transactions[i].getAmount();
      } else {
        sum -= transactions[i].getAmount();
      }
    }
    return sum;
  }

  public void credit(Currency currency, double amount) {
    Transaction creditT = new Transaction(Sign.CREDIT, currency, amount);
    add(creditT);
  } 

  public void debit(Currency currency, double amount) {
    if(balance() >= amount){
      Transaction debitT = new Transaction(Sign.DEBIT, currency, amount);
      add(debitT);
      } else {
      System.out.println("No Transaction: Current Bal Not enough ");
      }
    
  }


  public String toString() {
    return "Account(" //
        + Arrays.toString(this.transactions) //
        + ")";
  }



  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 1200));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 200));
    System.out.println(account.balance()); //1000
   
    System.out.println(account.balance()); 

    account.credit(Currency.HKD, 500);
    account.credit(Currency.HKD, 500);
    account.debit(Currency.HKD, 100);
    System.out.println("Bal: " + account.balance()); 


  }
}
