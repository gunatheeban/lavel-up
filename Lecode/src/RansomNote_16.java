import java.util.Arrays;

public class RansomNote_16 {

  public boolean canConstruct(String ransomNote, String magazine) {
    if (ransomNote.length() > magazine.length()) {
      return false;
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      for (int y = 0; y < magazine.length(); y++) {
        if (ransomNote.charAt(i) == magazine.charAt(y)) {
          if (i == ransomNote.length() -1) {
            return true;
          }
          i++;
        } else {
          if (y == magazine.length() -1) {
            return false;
          }
          i = 0;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    var solution = new RansomNote_16();
    System.out.println(solution.canConstruct("aab", "baa"));
  }
}
