import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Discount {
  
  
  public static void main(String[] args) {



    List<OrderItem> order = new ArrayList<>( //
        List.of(new OrderItem(Category.MEAT, "pork", 10),
            new OrderItem(Category.MEAT, "steak", 10),
            new OrderItem(Category.MEAT, "chicken wings", 10),
            new OrderItem(Category.STATIONARY, "pen", 10),
            new OrderItem(Category.STATIONARY, "rubber", 10)));

    System.out.println(discountedAmount(order, 0.8, 0.7));



    }    
    public static double discountedAmount (List<OrderItem> order, double mRate, double sRate) {
      BigDecimal sum = BigDecimal.valueOf(0);
      for (OrderItem o : order) {
        if (o.getCatergory().equals(Category.MEAT)) {
          sum = sum.add(BigDecimal.valueOf(o.getPrice()).multiply(BigDecimal.valueOf(mRate)));
        } else if (o.getCatergory().equals(Category.STATIONARY)) {
          sum = sum.add(BigDecimal.valueOf(o.getPrice()).multiply(BigDecimal.valueOf(sRate)));
        } else {
          sum = sum.add(BigDecimal.valueOf(o.getPrice()));
        }
      }
      return sum.doubleValue();
    }
}
