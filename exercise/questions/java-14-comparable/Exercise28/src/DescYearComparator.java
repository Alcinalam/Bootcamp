
import java.util.Comparator;

public class DescYearComparator implements Comparator<Movies>{

  @Override
  public int compare (Movies m1, Movies m2) {
    return m1.getYear() > m2.getYear() ? -1 : 1;
  }
  
  
  
}
