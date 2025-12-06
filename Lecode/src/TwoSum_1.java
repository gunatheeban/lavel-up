import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (seen.containsKey(diff)) {
        return new int[] {seen.get(diff), i};
      } else {
        seen.put(nums[i], i);
      }
    }
    return new int[] {0,0};
  }

  public static void main(String[] args) {
    var solution = new TwoSum_1();
    System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6)));
  }

}

