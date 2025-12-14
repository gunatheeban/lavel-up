import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ValidPalindrome_17 {

  public boolean isPalindrome(String s) {

  }

  public static void main(String[] args) {
    var solution = new ValidPalindrome_17();
    System.out.println(solution.isPalindrome("a", "b"));
  }

  //  optimized

  /**
   * public boolean canConstruct(String ransomNote, String magazine) {
   *     if (ransomNote.length() > magazine.length()) {
   *         return false;
   *     }
   *
   *     Map<Character, Integer> count = new HashMap<>();
   *
   *     // Count ransom note
   *     for (char c : ransomNote.toCharArray()) {
   *         count.put(c, count.getOrDefault(c, 0) + 1);
   *     }
   *
   *     // Consume magazine
   *     for (char c : magazine.toCharArray()) {
   *         if (count.containsKey(c)) {
   *             count.put(c, count.get(c) - 1);
   *             if (count.get(c) == 0) {
   *                 count.remove(c);
   *             }
   *         }
   *     }
   *
   *     return count.isEmpty();
   * }
   */
}
