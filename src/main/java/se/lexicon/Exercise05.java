package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {

    // tow-dimensional string array
    //assign values to 2d array

    String[][] citys = new String[2][2];

    citys[0][0] ="France";
    citys[0][1] = "Paris";
    citys[1][0] = "Sweden";
    citys[1][1] = "Stockholm";

    for(int i=0; i< citys.length; i++){
      for (int j=0; j < citys[i].length; j++){

          System.out.print(citys[i][j]+"\t");
      }
      System.out.println();
    }
  }

}
