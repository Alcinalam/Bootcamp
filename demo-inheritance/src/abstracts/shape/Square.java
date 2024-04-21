package abstracts.shape;

import java.math.BigDecimal;

public class Square extends Shape{
  
  public double length;

  @Override
  public double area(){
    return BigDecimal.valueOf(this.length) //
      .multiply(BigDecimal.valueOf(this.length)) //
      .doubleValue();


  }
}
