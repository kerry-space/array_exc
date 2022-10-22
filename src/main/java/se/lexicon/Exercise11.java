package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {

    //ask user for integer input
    //repeat question until user give specific value which user already has been told about in message in program
    //store values in array
    //print array
    //after reverse array element so first element becomes the last  element
    //second element becomes the second to last element etc..
    //do not only reverse the order which they are printed , need change the way they are stored in the array.

    Scanner sc = new Scanner(System.in);
    int userInput=0;
    boolean exitLoop = false;
    ArrayList<Integer>  userInputArr = new ArrayList<Integer>();
    while (!exitLoop){
      System.out.println("Welcome to array reverse index, Message 33 is way to start proccess: ");
       userInput = sc.nextInt();

      if (userInput == 33){
        exitLoop = true;
      }else {
        userInputArr.add(userInput);

      }
    }

    Object[] arrayNMumber = userInputArr.toArray();
    System.out.print(Arrays.toString(arrayNMumber));

    int[] reverseArr = new int[arrayNMumber.length];

        for(int i=0 ,j=arrayNMumber.length -1; i< arrayNMumber.length; i++, j--){
           reverseArr[i] = (int) arrayNMumber[j];


        }

    System.out.println();
    System.out.println(Arrays.toString(reverseArr));


  }

  private static void addElement(int[] sourceArr, int[] elementsToAdd){



  }

}
