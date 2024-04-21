import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Staff {
  
  private String name;

  public Staff(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString(){
    return "Staff(" //
      + "name=" + this.name //
      + ")";
  }

  @Override
  public boolean equals (Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Staff))
      return false;
    Staff s = (Staff) obj;
    return Objects.equals(this.name, s.getName());
  }

  @Override
  public int hashCode () {
    return Objects.hash(this.name);
  }

  public static void main(String[] args) {
    // Set is a data structure that ensures no duplicated element is stored
    // Set no idex becuase base is map, not array
    HashSet<Staff> staffs = new HashSet<>();
    staffs.add(new Staff("Vincent"));
    staffs.add(new Staff("Oscar"));
    System.out.println(staffs.size()); //2
    System.out.println(staffs.isEmpty()); //false
    // System.out.println(staffs.get); 無get 因為無order
    System.out.println(staffs);

    // add -> false
    System.out.println(staffs.add(new Staff("Vincent"))); // false (cannot add coz same element)
    System.out.println(staffs.size()); // 2

    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("hello");
    System.out.println(strings.size());

    ArrayList<Integer> integers = new ArrayList<>(); // <> inside cannot be primitive
    integers.add(100);
    integers.add(4);
    integers.add(100);
    integers.add(4);
    integers.add(44);
    System.out.println(integers);//[100, 4, 100, 4, 44]

    HashSet<Integer> integers2 = new HashSet<>();
    for (Integer x : integers) {
      integers2.add(x);
    }
    System.out.println(integers2);//[100, 4, 44]

    integers2.remove(new Integer(100));//[4, 44]
    System.out.println(integers2);

    System.out.println(integers2.contains(new Integer(44)));//true

    
  }
}
