package exercise.questions.questions;

import java.beans.JavaBean;
import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel

  private int carYear;
  private String carModel;

  // Constructor with variables carYear and carModel

  private JavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

   public String toString() {
    return carYear + "," + carModel;
  }


  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of class Exercise12, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    System.out.println(myCar);

  }
}

