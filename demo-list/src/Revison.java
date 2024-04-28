import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.security.auth.kerberos.KerberosCredMessage;
import java.util.Set;

public class Revison {
  public static void main(String[] args) {

    // HashMap<String, Integer> ageMap = new HashMap<>();
    // ageMap.put("Kay", Integer.valueOf(23));
    // ageMap.put("Mandy", 13);

    // System.out.println(ageMap.get("Kay"));
    // System.out.println(ageMap.get("Mandy"));

    // for (Map.Entry<String, Integer> m : ageMap.entrySet()) {
    //   System.out.println(m.getKey() + " " + m.getValue());
    // }

    // ageMap.put("Kay", 18);
    // System.out.println(ageMap.get("Kay"));

    // // sum up all intergers in the map
    // int sum = 0;
    // for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
    //   sum += entry.getValue();
    // }
    // System.out.println("age sum = " + sum);

    // HashMap<Customer, Integer> mapper = new HashMap<>();
    // mapper.put(new Customer("John"), 13);
    // mapper.put(new Customer("John"), 17);

    // System.out.println(mapper);

    // HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
    // ArrayList<Order> orders = new ArrayList<>();
    // orders.add(new Order(100));
    // orders.add(new Order(250));
    // orderMap.put(new Customer("John"), orders);

    // ArrayList<Order> orders2 = new ArrayList<>();
    // orders2.add(new Order(1200));
    // orders2.add(new Order(20));
    // orders2.add(new Order(88));
    // orderMap.put(new Customer("Rain"), orders2);

    // System.out.println(orderMap);
    
    // sum = 0;
    // for (ArrayList<Order> orderList : orderMap.values()) {
    //   for (Order o : orderList) {
    //     sum += o.getAmount();
    //   }
    // }  
    // System.out.println("<order> total= " + sum);

    // sum = 0;
    // for (Map.Entry<Customer,ArrayList<Order>> entry : orderMap.entrySet()) {
    //   for (Order o : entry.getValue()) {
    //     sum += o.getAmount();
    //   }
    // }
    // System.out.println("<entry> total= " + sum);

    // System.out.println(orderMap.containsKey(new Customer("Rain")));

    // orderMap.put(new Customer ("Sally"), orders);

    List<Integer> integers = new ArrayList() ;
    integers.add(2);
    integers.add(2);
    integers.add(2);
    integers.add(3);
    integers.add(3);
    integers.add(1);
    System.out.println(integers);
    System.out.println(getDuplicated(integers));
    
    // Set<Integer> s1 = new HashSet<>();
    // s1.add(10);
    // s1.add(9);
    // System.out.println("s" + s1);
    
    // System.out.println("s" + s1.contains(10));

    // Map<Integer, Integer> m1 = new HashMap();
    // m1.put(13,43);
    // m1.put(23,44);
    // System.out.println("before m" + m1);
    // System.out.println("m" + m1.containsKey(19));
    // System.out.println("after m" + m1);  


    
  }

  public static Set<Integer> getDuplicated(List<Integer> integers){
    Set<Integer>results = new HashSet<>();
    Map<Integer,Integer> map = new HashMap();
    for (Integer x : integers) {
      if (map.containsKey(x)) {
        results.add(x);
        continue;
      }
      map.put (x,null);
      System.out.println("Set=" + results);
      System.out.println("map=" + map);
    }
    return results;
  }
}
