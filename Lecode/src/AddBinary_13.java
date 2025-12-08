public class AddBinary_13 {
  public String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
    boolean carry = false;
    int loop = Math.min(a.length() - 1, b.length() - 1);
    for (int i = loop; i >= 0; i--) {
      if (a.length() >= i && b.length() >= i) {
        if (a.charAt(i) == b.charAt(i)) {
          if (String.valueOf(a.charAt(i)).equals("0")) {
            result.append("0");
          } else {
            carry = true;
            result.append("0");
          }
        } else {
          result.append("1");
        }
      }
    }

    return result.toString();
  }
  public static void main(String[] args) {
    var solution = new AddBinary_13();
    System.out.println(solution.addBinary("11", "1"));
  }
}

//correct solution
/**
 * class Solution {
 *     public String addBinary(String a, String b) {
 *         StringBuilder result = new StringBuilder();
 *         int i = a.length() - 1, j = b.length() - 1, carry = 0;
 *         while (i >= 0 || j >= 0 || carry == 1) {
 *             int total = carry;
 *             if (i >= 0) total += a.charAt(i--) - '0';
 *             if (j >= 0) total += b.charAt(j--) - '0';
 *             result.append(total % 2);
 *             carry = total / 2;
 *         }
 *         return result.reverse().toString();
 *     }
 * }
 */