public class PalindromeNumber_2 {

  public boolean isPalindrome(int x) {
    String num = String.valueOf(x);
    for (int i = 0; i < num.length(); i++) {
      if (num.charAt(i) != num.charAt((num.length() - 1) - i) && i != ((num.length()-1) - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    var solution = new PalindromeNumber_2();
    System.out.println(solution.isPalindrome(10));
  }

}

