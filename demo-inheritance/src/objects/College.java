package objects;

import java.util.Objects;

public class College {
  
  private double area;

  public double getArea(){
    return this.area;
  }

  @Override
  public String toString() {
    return "College(" //
      + "college=" + this.area //
      + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof College))
      return false;
    College c = (College) obj;
    return Objects.equals(this.area, getArea());
    }
    
  @Override
  public int hashCode() {
    return Objects.hash(this.area);
  }


  public static void main(String[] args) {
    Object o = new College(); //Object parent can create child class object(Polymorphism)
    // College c = new Object(); // Not ok
    // College c = new College(); // OK
    System.out.println(o.hashCode()); // 31 ,object reference convert to int value
    System.out.println(new College().hashCode());// 31, after @Override the hashCode()
    System.out.println(o.equals(new College())); // false, after override hashcode true

    if (o instanceof College) { // ask if o is an object of College.class 
      College c2 = (College) o;
    }

    String str = "ABC";
    System.out.println(str.hashCode()); // 64578 hashCode is a 
    // formula to gen out with value combintaion base on ASCII code

    // Number number = new Number() ; can't new number

    StringBuilder sb = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb.equals(sb2)); // false (toString override only ride on String)
    System.out.println(sb.compareTo(sb2)); // 0 SB need to use compareTo
    
    System.out.println(o);//College(college=0.0)

    Class<?> s = o.getClass();
    System.out.println(s.getName());// return a package String -> objects.College
    System.out.println(s.getClass().getName());//java.lang.Class
  }
}
