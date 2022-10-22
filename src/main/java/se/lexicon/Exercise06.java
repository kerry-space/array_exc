package se.lexicon;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {

    //set up array to hold next values in order: 43, 5, 23, 17, 2, 14
    //print averaqe 6 numbers

    int[] numbers = {43,5,23,17,2,14};
    int sum=0;

    for (int i=0; i<numbers.length; i++){
        sum += numbers[i];
    }
    float average = (float) sum/6;

    System.out.printf("average: %.1f",average);
  }

}
