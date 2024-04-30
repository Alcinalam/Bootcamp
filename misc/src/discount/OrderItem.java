import java.util.Objects;

public class OrderItem {
  
  private Category category;
  private String name;
  private double price;
  

  public OrderItem (Category category, String name, double price){
    this.category = category;
    this.name = name;
    this.price = price;
  }

  // public OrderItem ( String name, double price){
  //   this.name = name;
  //   this.price = price;
  // }

  public Category getCatergory(){
    return this.category;
  }

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

@Override
 public boolean equals (Object obj) {
  if (this == obj)
    return true;
  if (!(obj instanceof OrderItem))
    return false;
    OrderItem o = (OrderItem) obj;
  return Objects.equals(this.name, o.getName())
    && Objects.equals(this.category, o.getCatergory())
    && Objects.equals(this.price, o.getPrice());
 }

 @Override
 public int hashCode () {
  return Objects.hash (this.name, this.price,this.category);
 }

@Override
public String toString(){
  return "Shop(" //
    + " catergory= " + this.category //
    + " ,name= " + this.name //
    + " ,price= " + this.price //
    + ")";

  }





}
