import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
    // Set no index because base is map, not array
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

    ArrayList<Integer> integers3 = new ArrayList<>();
    integers3.add(78);
    integers3.add(68);
    integers3.add(98);

    Set<Integer> integers3c = new HashSet<>();
    for (Integer x : integers3) {
      integers3c.add(x);
    }
    System.out.println("3c=" + integers3c);

    System.out.println(integers2);//[100, 4, 44]

    integers2.remove(new Integer(100));//[4, 44]
    System.out.println(integers2);

    System.out.println(integers2.contains(new Integer(44)));//true

    
  }
}
