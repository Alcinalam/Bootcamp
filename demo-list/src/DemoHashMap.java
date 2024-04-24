import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap { // base as entry

  public static void main(String[] args) {

    // John 13
    // Vincent 18

    // Left hand side: KEY, right hand side = Value
    HashMap<String, Integer> mapper = new HashMap<>();
    mapper.put("John", Integer.valueOf(13)); // put an "entry" into map
    mapper.put("Vincent", 18); // auto box
    // no ordering.
    // Get value by Key (We CANNOT get key by value)

    System.out.println(mapper.get("Vincent")); // 18
    System.out.println(mapper.get("John")); // 13

    // for-each
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    // Key cannnot be duplicate in a HashMap
    // put -> update
    mapper.put("Vincent", 20);
    System.out.println(mapper.get("Vincent")); // 20

    mapper.put("Jenny", 24);
    // sum up all integers in the map
    int sum = 0;
    for (Map.Entry<String, Integer> m : mapper.entrySet()) {
      sum += m.getValue();
    }
    System.out.println("sum=" + sum);

    HashMap<Customer, Integer> ageMap = new HashMap<>();
    ageMap.put(new Customer("John"), 13);
    ageMap.put(new Customer("John"), 17);
    System.out.println(ageMap.get(new Customer("John")));// no hashcode -> null ,with hashcode 17

    System.out.println(ageMap.size()); // 2

    //
    HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();

    ArrayList<Order> orders = new ArrayList<>();
    orders.add(new Order(100));
    orders.add(new Order(250));
    orderMap.put(new Customer("John"), orders);

    ArrayList<Order> orders2 = new ArrayList<>();
    orders.add(new Order(1200));
    orders.add(new Order(20));
    orders.add(new Order(88));
    orderMap.put(new Customer("Vincent"), orders2);

  
    // John -> order 1:100, order 2: 250
    // Vincent -> order: 1:200, orde 2:20, order 3: 88

    // totalOrderAmount=1658
    sum = 0;
    for (Map.Entry<Customer, ArrayList<Order>> entry : orderMap.entrySet()) {
      // entrySet() --> entry -->
      for (Order o : entry.getValue()) {
        sum += o.getAmount();
      }
    }
    System.out.println("<map.entry> totalOrderAmount= " + sum);

    // approach only loop list
    sum = 0;
    for (ArrayList<Order> orderList : orderMap.values()) {
      for (Order o : orderList) {
        sum += o.getAmount();
      }
    }
    System.out.println("<order> totalOrderAmount= " + sum);

    // loop keySet()
    for (Customer customer : orderMap.keySet()) {
      System.out.println("Customer = " + customer.getName());
    }

    // containsKey(), containsValue()
    System.out.println(orderMap.containsKey(new Customer("Vincent"))); // false
    

    // Conclusion:
    // 1. If they are different Objects -> we can treat them as same thing equals(), hashCode()
    // 2. If they are Same Object, -> all the values inside the object are same

    // orderMap.put(new Customer ("Sally"), orders); // same array objects with John
    
    // orders -> add an order
    orders.add(new Order(55));

    // print out John and Sally orders
    // System.out.println("Sally" + orderMap.get(new Customer("Sally")));
    // System.out.println("John" + orderMap.get(new Customer("John")));
    
    HashMap<String, ArrayList<Order>> example1 = new HashMap <>();
    HashMap<Integer, ArrayList<Order>> example2 = new HashMap <>();

    orderMap.remove(new Customer("Vincent"));
    // with hashCode(), cannot remove by customer object
    System.out.println("end" + orderMap);
  }
}
