package se.lexicon;

import java.util.Arrays;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    //create two array arbitrary size
    //fill with random numbers
    //copy random array numbers over so even numbers located in rear (right side <-)
    //then odd numbners aree located in front part (left side ->)

    int[] arr1 = new int[] {13,33,66,99,12};
    int[] arr2 = new int[]{30,99,10,11,39};

    //combined two array
     arr1 = arrayConcat(arr1,arr2);
     System.out.println(Arrays.toString(arr1));

     //sort odd number left and even number right
    int[] sorted = evenOddNumber(arr1);

    //print result
    System.out.println(Arrays.toString(sorted));




  }

  private static int[] arrayConcat(int[] source, int[] arrAdd){
     int[] combined = Arrays.copyOf(source, source.length + arrAdd.length);
     for(int i=source.length, j=0; i< combined.length; i++,j++){
       combined[i]= arrAdd[j];
     }
     return combined;
  }

  private  static int[] evenOddNumber(int[] cpArr){
    int[] temp = new int[cpArr.length];
    int frontIndex = 0;
    int backIndex = cpArr.length-1;

    for(int i :cpArr){
        if(i % 2== 0){
            temp[frontIndex] = i;
            frontIndex++;
        }else {
            temp[backIndex] = i;
            backIndex--;
        }
    }

    return temp;
  }

}
