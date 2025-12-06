import java.util.Map;

public class RomanToInt_3 {

  private static final Map<Character, Integer> romanMap = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
  );

  public int romanToInt(String s) {
    int result = 0;
    int len = s.length();

    for (int i = 0; i < len; i++) {
      int current = romanMap.get(s.charAt(i));
      int next = (i + 1 < len) ? romanMap.get(s.charAt(i + 1)) : 0;

      if (current >= next) {
        result += current;
      } else {
        result += (next - current);
        i++;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    var solution = new RomanToInt_3();
    System.out.println(solution.romanToInt("MCMXCIV"));
  }

}

