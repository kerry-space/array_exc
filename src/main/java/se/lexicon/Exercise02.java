package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */

  static int[] numbers = {1,0,5,2,4,1};
  public static void ex2() {


    Scanner sc = new Scanner(System.in);
    System.out.print("Search for number in the array: ");
    int input = sc.nextInt();
    System.out.println(indeof(input));

  }


  private  static int indeof(int input){

    for (int index=0; index< numbers.length; index++){
      if (numbers[index] == input){
        return index;
      }
    }

    return -1;

  }


}
