import java.util.Arrays;

public class StrStr_9 {

  public int strStr(String haystack, String needle) {

    if (haystack.length() < needle.length()) {
      return -1;
    }
    int i = 0;
    int j = 0;
    while (i < haystack.length()) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        if ((needle.length() - 1) == j) {
          return i - j;
        }
        i++;
        j++;
      } else {
        System.out.println(" i "+ i + " j " + j);
        i = i - j + 1;
        j = 0;
        if (i + needle.length() > haystack.length()) {
          return -1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    var solution = new StrStr_9();
    System.out.println(solution.strStr("misssisippi", "issip"));
  }
}