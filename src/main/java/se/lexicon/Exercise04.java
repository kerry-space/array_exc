package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {

    //copy elements of any array to another array
    // expect output  1 15 20

    int[] numbers = {1,15,20};
    int[] cpnNumbers = Arrays.copyOf(numbers, numbers.length);

    for(int cpNumber: cpnNumbers){
      System.out.print(cpNumber+"\t");
    }

  }


}
