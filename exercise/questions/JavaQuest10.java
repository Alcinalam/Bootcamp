package exercise.questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
                        
    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(myArray));

    // code here ...
    int newArr [] = new int [myArray.length];
    for (int i = 0 ; i < myArray.length ;i++ ){
      if (i < indexPosition){
        newArr[i]= myArray[i];
      } else if (i== indexPosition) {
        newArr[i]= newValue;
      } else {
        newArr[i]= myArray[i-1];
      }

    } 

    // myArray = newArr;
    System.out.println("New Array: " + Arrays.toString(newArr));
  }
}