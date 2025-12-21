package algorithms.TwoPointer.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingCharacterReplacement {

  public int characterReplacement(String s, int k) {

    int[] freq = new int[26];
    int start = 0;
    int maxFreq = 0;
    int maxLength = 0;

    for (int end = 0; end < s.length(); end++) {

      int idx = s.charAt(end) - 'A';
      freq[idx]++;
      maxFreq = Math.max(maxFreq, freq[idx]);

      int windowSize = end - start + 1;

      if (windowSize - maxFreq > k) {
        freq[s.charAt(start) - 'A']--;
        start++;
      }

      maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
  }

  static void main(String[] args) {
    var o = new LongestRepeatingCharacterReplacement();
    System.out.println(o.characterReplacement("AAABBBBA", 1));
  }
}
