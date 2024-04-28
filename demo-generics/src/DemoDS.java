import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DemoDS { //change data affect two data set with sturture HashMap & LinkedList,anchor StringPrinter
  public static void main(String[] args) {
   
  Map<String, StringPrinter> map = new HashMap<>();
  StringPrinter sp = new StringPrinter("hello");
  StringPrinter sp2 = new StringPrinter("world");
  map.put("a", sp);
  map.put("b",sp2);

  Queue<StringPrinter> qs = new LinkedList<>();
  qs.add(sp);
  qs.add(sp2);

  sp2.setData("xxx");
  System.out.println("map=" + sp2);
  System.out.println("qs=" + qs); // qs=[StringPrinter(data=hello), StringPrinter(data=xxx)]
  
  }
}
