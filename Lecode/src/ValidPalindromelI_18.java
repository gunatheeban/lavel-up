import java.util.HashMap;
import java.util.Map;

public class ValidPalindromelI_18 {

  public boolean validPalindrome(String s) {
    int start = 0;
    int end = s.length()-1;
    int miss = 0;
    while (start <= end) {
      System.out.println(start + " -- "+ end);
      if (!Character.isAlphabetic(s.charAt(start))) {
        start++;
      }

      if (!Character.isAlphabetic(s.charAt(end))) {
        end--;
      }

      if (s.charAt(start) != s.charAt(end)) {
        miss++;
      }

      start++;
      end--;
    }
    if (s.length() <= 3) {
      return miss == 0;
    } else {
      return miss <= 1;
    }
  }

  public static void main(String[] args) {
    var solution = new ValidPalindromelI_18();
    System.out.println(solution.validPalindrome("abc"));
  }

//  correct Approch
//
/**
 *
 * class Solution {
 *     public boolean isPalindrome(String s, int left, int right) {
 *         while (left < right) {
 *             if (s.charAt(left) != s.charAt(right)) return false;
 *             left++;
 *             right--;
 *         }
 *         return true;
 *     }
 *
 *     public boolean validPalindrome(String s) {
 *         int left = 0, right = s.length() - 1;
 *
 *         while (left < right) {
 *             if (s.charAt(left) != s.charAt(right)) {
 *                 return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
 *             }
 *             left++;
 *             right--;
 *         }
 *
 *         return true;
 *     }
 * }
 */
}
