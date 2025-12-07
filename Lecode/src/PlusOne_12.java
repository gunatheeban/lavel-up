import java.util.Arrays;

public class PlusOne_12 {
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; 0 <= i; i--) {
       if (digits[i] < 9) {
         digits[i]++;
         return digits;
       }
       digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

  public static void main(String[] args) {
    var solution = new PlusOne_12();
    int[] nums = {9,9,9};
    System.out.println(Arrays.toString(solution.plusOne(nums)));
  }
}