public class Square {
  public static void main(String[] args) {

  Square square = new Square();
  square.setLength(13);
  System.out.println(square.toString()); // "Square(length=13)"
  System.out.println(square.area()); // 169
    
  }
  
  private int length;
  
  public void setLength(int length) {
    this.length = length;
  }
  public int getLength(){
    return this.length;
  }
  public int area(){
    return this.length * this.length; // Math.pow(this.length,2)
  }

  public String toString(){
    return "Square("//
        + "length=" + this.length //
        + ")";
  }

}
