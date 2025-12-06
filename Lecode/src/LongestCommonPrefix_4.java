import java.util.Map;

public class LongestCommonPrefix_4 {

  public String longestCommonPrefix(String[] strs) {
    char[] chars = strs[0].toCharArray();
    for (int i = 1; i < strs.length; i++) {
      char[] word = strs[i].toCharArray();
      for (int j = 0; j < chars.length; j++) {
        if ((j < word.length && chars[j] != word[j] && chars[j] != ' ') || word.length -1 < j) {
          chars = String.valueOf(chars).substring(0, j).toCharArray();
        }
      }
    }
    return String.valueOf(chars).trim();
  }

  public static void main(String[] args) {
    var solution = new LongestCommonPrefix_4();
    System.out.println(solution.longestCommonPrefix(new String[] {"ab", "a"}));
  }

}

