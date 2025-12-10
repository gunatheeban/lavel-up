import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement_15 {

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> integerMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if ( integerMap.containsKey(nums[i])) {
        int i1 = integerMap.get(nums[i]) + 1;
        integerMap.put(nums[i], i1);
      } else {
        integerMap.put(nums[i], 0);
      }
    }

    int result = 0;
    int max = 0;
    for ( Entry entry : integerMap.entrySet()) {
      int maxV = (Integer) entry.getValue();
      if (max <= maxV) {
        result = (Integer) entry.getKey();
        max = maxV;
      }

    }

    return result;
  }

  public static void main(String[] args) {
    var solution = new MajorityElement_15();
    int[] nums = {5};
    System.out.println(solution.majorityElement(nums));
  }
}
