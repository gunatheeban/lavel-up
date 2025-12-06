import java.util.Stack;

public class IsValid_5 {

  public boolean isValid(String s) {

    Stack<Character> chars = new Stack<>();
    for (char c : s.toCharArray()) {
      if ('(' == c || '{' == c || '[' == c) {
        chars.push(c);
      } else {
        if (chars.empty()) {return false;}
        char po = chars.pop();
        if (')' == c && po != '(' || '}' == c && po != '{' || ']' == c && po != '[') {
          return false;
        }
      }
    }

    return chars.empty();
  }

  public static void main(String[] args) {
    var solution = new IsValid_5();
    System.out.println(solution.isValid("]"));
  }

}

