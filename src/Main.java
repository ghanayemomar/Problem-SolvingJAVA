import java.util.*;

class Main {
  public static void mergeAndSort(int[] arr1, int[] arr2) {
    int[] arr3 = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    System.out.println(Arrays.toString(arr3));
    int temp = 0;
    for (int i = 0; i < arr3.length; i++) {
      for (int j = i + 1; j < arr3.length; j++) {
        if (arr3[i] > arr3[j]) {
          temp = arr3[i];
          arr3[i] = arr3[j];
          arr3[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr3));
  }

  public static void main(String[] args) {
    int[] array1 = { 3, 2, 1 };
    int[] array2 = { 6, 5, 4 };
    mergeAndSort(array1, array2);
  }
}