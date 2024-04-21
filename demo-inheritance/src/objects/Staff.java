package objects;

import java.time.LocalDate;
import java.util.Objects;

public class Staff { // 1. All class implicitly extends Topmost class "Object", aka. extends Object

  private LocalDate joinDate;

  public Staff(LocalDate joinDate){
    this.joinDate = joinDate;
  }
  
  public LocalDate getJoinDate (){
    return this.joinDate;
  }

  @Override
  public String toString(){ // 2. override object class toString()
    return "Staff(" //
      + "joinDate=" + this.joinDate //
      + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Staff))
      return false;
    Staff s = (Staff) obj;
    return Objects.equals(this.joinDate, s.getJoinDate());
  }

  public static void main(String[] args) {
    Object o = new Object(); // Object highest rank, all others class is child class,
    System.out.println(o.toString()); // java.lang.Object@4617c264 <--object reference //
    // of object class' object value

    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString()); // abstracts.objects.Staff@54bedef2 

    Staff s2 = new Staff(LocalDate.now());
    System.out.println(s2.toString()); // abstracts.objects.Staff@54bedef2
    System.out.println(s == s2); //false
    System.out.println(s.getJoinDate().equals(s2.getJoinDate())); // false<--cause it use Object equals method
    System.out.println(s.getJoinDate().compareTo(s2.getJoinDate())); // true

    System.out.println(s2);
  }


}
