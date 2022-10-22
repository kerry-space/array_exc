package se.lexicon;

import java.util.Arrays;
//


public class Exercise01 {

  /**
   * 1. Write a program which will store elements in an array of type ‘int’ and
   * print it out.
   * Expected output: 11 23 39 etc.
   */
  public static void ex1() {
      int[] numbers = {11,23,39};
      System.out.print("Expected out:");
    for(int number : numbers){
        System.out.print( + number + "\t");
    }
  }


}
