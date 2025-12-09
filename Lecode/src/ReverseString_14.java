public class ReverseString_14 {
  public boolean reverseString(char[] s) {
    int charLength = s.length - 1;
    for (int i = 0; i < charLength; i++) {
      if (i >= (charLength - i)) {
        break;
      }
      char temp = s[i];
      s[i] = s[charLength - i];
      s[charLength - i] = temp;
//      System.out.println("----------------- " + i + " ----------------------");
//      System.out.println("----------------- " + i + " == " + (charLength - i) + " ----------------------");
//      System.out.println(s);
    }
    return true;
  }

  public static void main(String[] args) {
    var solution = new ReverseString_14();
    char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
    solution.reverseString(s);
    System.out.println(s);
  }
}
