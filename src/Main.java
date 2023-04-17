//Moves Zero's: 
import java.util.*;

class Main {
  public static void moveZeros(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        array[count] = array[i];
        count++;
      }
    }
    while (count < array.length) {
      array[count] = 0;
      count++;
    }
    System.out.println(Arrays.toString(array));

  }

  public static void main(String[] args) {
    int[] array = { 1, 0, 2, 0, 3, 0, 4 };
    moveZeros(array);
  }
}