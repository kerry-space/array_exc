package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
    // sort array
    //String array: [Paris, London, New York, Stockholm]
    //Sort string array: [London, New York, Paris, Stockholm]
    String[] citys = {"Paris", "London", "New York", "Stockholm"};


    System.out.print("String array: ");
    for(String city : citys){
      System.out.print(city +"\t");
    }
    System.out.println();

    //sort array method
    Arrays.sort(citys, String.CASE_INSENSITIVE_ORDER);

    System.out.print("Sort string array: ");
    for(String city:  citys) {
      System.out.print(city+"\t");
    }
  }



}
