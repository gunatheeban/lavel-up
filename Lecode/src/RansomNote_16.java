import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RansomNote_16 {

  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }
    HashMap<Character, Integer> ransomNoteHashMap = new HashMap<>();
    for (int i = 0; i < ransomNote.length(); i++) {
      if (ransomNoteHashMap.containsKey(ransomNote.charAt(i))) {
        ransomNoteHashMap.compute(ransomNote.charAt(i), (k, i1) -> i1 + 1);
      } else {
        ransomNoteHashMap.put(ransomNote.charAt(i), 1);
      }
    }

    HashMap<Character, Integer> magazineHashMap = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      if (magazineHashMap.containsKey(magazine.charAt(i))) {
        magazineHashMap.compute(magazine.charAt(i), (k, i1) -> i1 + 1);
      } else {
        magazineHashMap.put(magazine.charAt(i), 1);
      }
    }

    Set<Entry<Character, Integer>> entries = ransomNoteHashMap.entrySet();
    for ( Entry entry :entries) {
      if (!(magazineHashMap.containsKey(entry.getKey()) && (Integer) entry.getValue() <= magazineHashMap.get(entry.getKey()))) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    var solution = new RansomNote_16();
    System.out.println(solution.canConstruct("a", "b"));
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
