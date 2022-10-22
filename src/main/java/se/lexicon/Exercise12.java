package se.lexicon;

public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {

    //intialze two dimensional array
    //print out diagonal elements

    int[][] numbers = new int[3][3];
    numbers[0][0] = 1;
    numbers[0][1] = 2;
    numbers[0][2] = 3;

    numbers[1][0] = 2;
    numbers[1][1] = 4;
    numbers[1][2] = 6;

    numbers[2][0] = 3;
    numbers[2][1] = 6;
    numbers[2][2] = 9;

    System.out.print(numbers[0][0]+"\t");
    System.out.print(numbers[1][1]+"\t");
    System.out.print(numbers[2][2]);
  }
}
