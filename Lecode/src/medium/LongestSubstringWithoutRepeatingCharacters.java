package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


  public int lengthOfLongestSubstring(String s) {
    Set set = new HashSet<>();
    int maxCount = 0;
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        if (!set.contains(s.charAt(j))) {
          set.add(s.charAt(j));
        } else {
          maxCount = Math.max(set.size(), maxCount);
          set.clear();
        }
      }
    }
    return Math.max(set.size(), maxCount);
  }
  public static void main(String[] args) {
    var solution = new LongestSubstringWithoutRepeatingCharacters();
    System.out.println(solution.lengthOfLongestSubstring("jbpnbwwd"));
  }
}