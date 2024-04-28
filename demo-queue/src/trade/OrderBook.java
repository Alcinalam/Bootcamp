package trade;

import java.util.HashMap;
import java.util.Map;

public class OrderBook {

  private int marketIndex;
  private Map<Double,Integer> entries;

  public OrderBook (Map<Double,Integer> entries) {
    this.entries = entries;
  }
  

  
  // assumption $1 - $2, $0.05
  // Buy, your price < market price needa wait
  // Buy, your price >= market price
  // Sell, your price > market price needa wait
  // Sell, your price <= market price 

  // Buy
  // $10 2q (1) -> trade 1q at $10
  // $2 1000q

  // Sell
  // $11 3q (1)
  // $13 100q (1)

  // Market Price  -> the price of the last trade in the market

public static void main(String[] args) {
  Map<Double,Integer> buy = new HashMap();
  buy.put(1.05d, 2000);
  buy.put(1.10d, 4000);
  buy.put(1.40d, 2000);

  Map<Double,Integer> sell = new HashMap();
  sell.put(1.05d, 2000);
  sell.put(1.10d, 4000);
  sell.put(1.40d, 2000);

  
}



}
