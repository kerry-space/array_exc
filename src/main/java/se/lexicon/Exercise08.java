package se.lexicon;

import java.util.Arrays;

public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {

    //remove dublicate elemetn from array [20, 20, 40, 20, 30, 40, 50, 60, 50]
    int[] numbers = {20,20,40,20,30,40,50,60,50};


    //start sorting
    Arrays.sort(numbers);

    //keep track of index of arr
    int index=0;
    int[] temp = new int[numbers.length];
    for(int i=0; i<numbers.length -1; i++){
       if(numbers[i] != numbers[i+1]){
         temp[index++] = numbers[i];
       }
    }


    //include the last the last element
    temp[index++] =  numbers[numbers.length-1];

    int[] sortedArr = new int[index];

    for (int i=0; i<index; i++){
      sortedArr[i] = temp[i];
    }
    System.out.println(Arrays.toString(sortedArr));
  }


}
