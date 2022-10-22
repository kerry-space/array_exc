package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */

  private static int[][] numbers = new int[11][11];
  public static void ex10() {
      //represent multiplication table stored in mulitdimen array



    mulit();




  }

    private static void  mulit(){
      for (int i=1; i<numbers.length; i++){
        for (int j=1; j<numbers[i].length; j++){
          numbers[i][j] = i * j;

        }
      }

      for (int i=1; i<numbers.length; i++){
        for (int j=1; j<numbers[i].length; j++){
          System.out.print( numbers[i][j] + "\t" );

        }
        System.out.println("\n");
      }
    }
}
