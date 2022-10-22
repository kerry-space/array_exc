package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {


    //array hold 10 numbers
    //print only uneven numbers
    //Odd Array: 1 7 9

    int[] numbers = {1,2,4,7,9,12};
    for(int number : numbers){
      if(number %2 !=0){
        System.out.print(number+"\t");
      }
    }


  }

}
