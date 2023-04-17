import java.util.Arrays;

class Main {
  public static void fizzBuzz(int n) {
    String[] solution = new String[n];
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        solution[i-1] = "FizzBuzz";
      } else if (i % 3 == 0) {
        solution[i-1] = "Fizz";
      } else if (i % 5 == 0) {
        solution[i-1] = "Buzz";
      } else {
        solution[i-1] = Integer.toString(i);
      }
    }
    System.out.println(Arrays.toString(solution));
  }

  public static void main(String[] args) {
    fizzBuzz(15);
  }
}
