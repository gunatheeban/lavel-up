public class LengthOfLastWord_11 {
  public int lengthOfLastWord(String s) {
    String[] split = s.split(" ");

    for (int i = split.length -1; 0 <= i; i--) {
      if (!split[i].trim().isBlank()) {
        return split[i].trim().length();
      }
    }
    return 0;
  }
  public static void main(String[] args) {
    var solution = new LengthOfLastWord_11();
    System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));
  }

  //Best solution
//  public int lengthOfLastWord(String s) {
//    int i = s.length() - 1;
//    while(s.charAt(i)==' ')
//      i--;
//    int count = 0;
//    while(i >= 0 && s.charAt(i)!=' ')
//    {
//      count++;
//      i--;
//    }
//    return count;
//  }
}