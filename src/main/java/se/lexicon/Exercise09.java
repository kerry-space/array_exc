package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */
  public static <string> void ex9() {
      //declare array with store value
      // method addElement
      //combine both index of array size
      //copy array over to existence array
      //return combined array

   String[] names = new String[0];
   String[] addNames = {"kerry", "love"};
    String[] expanArr = addElement(names, addNames);
    System.out.print(Arrays.toString(expanArr));

  }

  private static String[] addElement(String[] sourceArr, String[] elementsToAdd){

      String[] combined = Arrays.copyOf(sourceArr, sourceArr.length+ elementsToAdd.length);

      for (int i=sourceArr.length, j=0; i < combined.length; i++, j++){
           combined[i] = elementsToAdd[j];
      }
      return combined;
  }
}
