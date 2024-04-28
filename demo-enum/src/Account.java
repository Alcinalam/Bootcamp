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

  double sum = 0;
  public double balance() {
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

  }

  public void debit(Currency currency, double amount) {
 
  }

  public String toString() {
    return "Account(" //
        + Arrays.toString(this.transactions) //
        + ")";
  }



  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 1300));
    System.out.println(account.balance()); //1200

    account.credit(Currency.HKD, 1000);
    account.debit(Currency.HKD, 500);
    System.out.println(account.balance()); 

  }
}
