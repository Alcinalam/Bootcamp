package objects;

public class Dog extends Person{

  private int id;

  private Color color;

  public Dog(){

  }


  public Dog(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public int getID() {
    return this.id;
  }

}
