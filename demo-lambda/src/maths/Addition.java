package maths;

public class Addition implements MathOperation{ // if not using lambda, need a class to support

  @Override
  public double Operation (double x , double y) {
    return x + y;
  }



  public static void main(String[] args) {
    Addition addition = new Addition(); 
    addition.Operation(100, 5); //105
  }

}
